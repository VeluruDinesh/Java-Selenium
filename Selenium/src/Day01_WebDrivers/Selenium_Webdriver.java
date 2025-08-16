package Day01_WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Selenium_Webdriver{

	public static void main(String[] args) {
		

		
		        WebDriver driver = new EdgeDriver();
		        driver.get("https://www.google.com");
		        System.out.println("Page title: " + driver.getTitle());
		        driver.close();
		    
		

	}

}

