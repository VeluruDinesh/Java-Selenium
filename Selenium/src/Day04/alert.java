package Day04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		
		Alert alert = driver.switchTo().alert();

		// Enter text into alert
		alert.sendKeys("Hello");

		// Print the alert text
		System.out.println("Alert says: " + alert.getText());

		// Accept the alert
		alert.accept();

	}

}
