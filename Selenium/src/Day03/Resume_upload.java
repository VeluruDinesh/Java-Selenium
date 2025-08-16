package Day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_upload {

	public static void main(String[] args) throws InterruptedException, IOException{
	   Properties props = new Properties();
       FileInputStream fis = new FileInputStream("./src/Day03/details.properties");
       props.load(fis);
 
        String email = props.getProperty("naukri.email");
        String password = props.getProperty("naukri.password");
        String resumePath = props.getProperty("resume.path");
        //String chromeDriverPath = props.getProperty("chromedriver.path");
 
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://login.naukri.com/nLogin/Login.php");

		driver.findElement(By.id("usernameField")).sendKeys(email);
        driver.findElement(By.id("passwordField")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();	            
        Thread.sleep(5000);
        driver.get("https://www.naukri.com/mnjuser/profile");	                       
        Thread.sleep(5000);
		
		
			File uploadFile=new File(resumePath);
			WebElement fileInput = driver.findElement(By.className("fileUpload"));
			fileInput.sendKeys(uploadFile.getAbsolutePath());
			  Thread.sleep(5000);
			
			driver.quit();
		

	}

}
