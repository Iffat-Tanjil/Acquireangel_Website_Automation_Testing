package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_For_Sellers_Sign_Out_Page {

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

		// Go To Sign In Page First
		Thread.sleep(1000);
		driver.findElement(By.linkText("SignIn")).click();

		// Select Sellers Email Address using id locator

		Thread.sleep(2000);

		driver.findElement(By.name("Email")).sendKeys("trexton.haniel@milkcreeks.com");

		// Select Password using name locator

		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("12345678");

		// Choose Remember Me using Xpath locator

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='IsRemember']")).click();

		// Select SignIn Button using CssSelector locator

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block']")).click();

		// Click on Log Out Button

		Thread.sleep(4000);
		driver.findElement(By.linkText("Sign Out")).click();

		// Close Browser
		Thread.sleep(1000);
		driver.close();
	}

}
                              // End of Sellers Log Out Testing
