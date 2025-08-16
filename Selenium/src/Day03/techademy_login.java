package Day03;

import java.io.FileInputStream;
import java.io.IOException;
//import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.support.ui.WebDriverWait;

public class techademy_login {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//https://auth.techademy.com/
			   Properties props = new Properties();
	       FileInputStream fis = new FileInputStream("./src/Day03/details.properties");
	       props.load(fis);
	       
	        String email = props.getProperty("email");
	        String password = props.getProperty("password");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			 driver.get("https://one.techademy.com/main/Wipro");
			 Thread.sleep(9000);
			
			 driver.findElement(By.className("MuiInputBase-input")).sendKeys(email);
			 driver.findElement(By.xpath("//button[@type='button']")).click();
			Thread.sleep(8000);
			
	      driver.findElement(By.name("password")).sendKeys(password);
	        driver.findElement(By.name("login")).click();	            
	        Thread.sleep(5000);
	        driver.close();

	}
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("MuiInputBase-input")))
    // .sendKeys(email);
	// driver.findElement(By.name("password")).click();
	 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")))
       //.sendKeys(password);
	

}
