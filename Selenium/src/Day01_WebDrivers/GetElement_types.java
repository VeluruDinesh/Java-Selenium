package Day01_WebDrivers;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetElement_types {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://enterprise.github.com/login");
		driver.get("https://enterprise.github.com/login");
		
		 driver.switchTo().newWindow(WindowType.TAB);
		   driver.get("https://www.youtube.com");
		   
		   driver.quit();*/
		/*Thread.sleep(3000);
		driver.findElement(By.id("new_user"));
		driver.findElement(By.className("input"));
		driver.findElement(By.name("authenticity_token"));
		driver.findElement(By.tagName("h1"));
		driver.findElement(By.cssSelector());
		*/
		
		  
		    
		           
		           //System.setProperty("webdriver.chrome.driver", "/Users/hammadafroz/Desktop/SeleniumDemo/chromedriver-mac-x64/chromedriver");
		    
		           WebDriver driver = new ChromeDriver();
		    
		           
		           
		           System.out.print("hello");
		    
		          
		           driver.get("https://www.google.com");
		           Thread.sleep(2000);
		           
		           System.out.print("hello");
		           
		           driver.get("https://www.facebook.com");
		           Thread.sleep(2000);
		           
//		           driver.get("www.youtube.com");
		           
		           //driver.switchTo().window("www.youtube.com");
		    
		           
		           
		    
		           
		           Thread.sleep(5000);
		           driver.quit();
		       
		   
		    
		

	}

}
