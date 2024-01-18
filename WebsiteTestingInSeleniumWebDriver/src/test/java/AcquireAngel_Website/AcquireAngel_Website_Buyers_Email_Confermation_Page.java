package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_Buyers_Email_Confermation_Page {

	public static void main(String[] args) throws InterruptedException {
		
		// Setup WebDriverManager For ChromeDriver

		WebDriverManager.chromedriver().setup();

		// Create WebDriver Object For Chrome Browser

		WebDriver driver = new ChromeDriver();

		// Visit AcquireAngel Website
		driver.get("https://www.acquireangel.com/");

		// Maximize Browser
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		// Go To Join Now Page First
		Thread.sleep(1000);
		driver.findElement(By.linkText("Join Now")).click();
		
		                 // Test Buyers Email Confirmation Page

		// Give Value ate Buyer Account

		// Select Buyer Radio Button
		
		Thread.sleep(1000);
		driver.findElement(By.id("Seller")).click();

		// Click on Email Address using id locator

		Thread.sleep(1000);
		driver.findElement(By.id("Email")).click();

		// Select and give Email Address using id locator

		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("atlee.jyaire@milkcreeks.com");

		// Select Password using name locator

		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys("12345678");

		// Select SignUp using CssSelector locator

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block']")).click();
		
		
		// Now Test Confirmation Page
		
		// There are 2 option Re-send And Sign In
		
		// Click On Re-send
		Thread.sleep(2000);
		driver.findElement(By.id("resendVerificationEmail")).click();
		
		// Click On Sign In
				Thread.sleep(1000);
				driver.findElement(By.cssSelector(".btn.btn-primary")).click();
				
				// Back To Join Now Page
				Thread.sleep(2000);
				driver.navigate().back();
				
				// Close Browser
				Thread.sleep(1000);
				driver.close();
	}

}
                  // End Of Buyer Confirmation Page Testing.
