package Day04;
import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class filpkart {
	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		Properties props = new Properties();
       FileInputStream fis = new FileInputStream("./src/Day04/amazon.properties");
        props.load(fis);        
        String email = props.getProperty("amazon.email");
        //String password = props.getProperty("amazon.password");
        
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
        driver.get("https://www.flipkart.com/");   
       driver.findElement(By.xpath("//a[text()='Login']")).click();

       driver.findElement(By.xpath("//input[@type='text' and contains(@class,'r4vIwl')]")).sendKeys(email);
        driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
        Thread.sleep(25000);
        List<String> products = new ArrayList<>();
        products.add("laptop");
        products.add("headphones");
        products.add("wireless mouse");
        for (String product : products) {
            
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.clear();
            searchBox.sendKeys(product);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.findElement(By.className("_75nlfW")).click();
            driver.findElement(By.className("QqFHMw")).click();
           
            Thread.sleep(3000);

            
            
            }

        
        driver.findElement(By.className("tP+nZg")).click();
        Thread.sleep(5000);  
       
        driver.quit();
	}

}
