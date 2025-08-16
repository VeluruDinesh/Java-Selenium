package Day01_WebDrivers;
import org.openqa.selenium.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_WebDriver{

	public static void main(String[] args) {
		

		       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\velur\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		      
		        WebDriver driver = new ChromeDriver();

		        
		        driver.get("https://www.google.com");

		        WebElement searchBox = driver.findElement(By.name("q"));
                searchBox.sendKeys("Selenium WebDriver tutorial");
		        searchBox.sendKeys(Keys.RETURN);
		        try { Thread.sleep(30000); }
		        catch (InterruptedException e) {}

		        
		        System.out.println("Results Page Title: " + driver.getTitle());
		        
		        driver.quit();
		        
		    
		

	}

}
