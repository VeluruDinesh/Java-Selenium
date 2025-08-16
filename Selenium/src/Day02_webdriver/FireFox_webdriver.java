package Day02_webdriver;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
public class FireFox_webdriver {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.google.com");
		  System.out.println("Tittle :"+driver.getTitle());
		 // FirefoxDriver fire=new   FirefoxDriver();
		  //System.out.println("Tittle :"+fire.getBrowserVersion());
		  

	}

}
