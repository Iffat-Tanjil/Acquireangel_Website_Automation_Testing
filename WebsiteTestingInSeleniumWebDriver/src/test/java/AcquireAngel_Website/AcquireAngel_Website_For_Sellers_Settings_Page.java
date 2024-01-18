package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_For_Sellers_Settings_Page {

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

		// Now Test Sellers Settings Dashboard

		// First Go To Settings Page From Sellers Dashboard
		Thread.sleep(2000);
		driver.findElement(By.linkText("Settings")).click();

		// Settings Dashboard Has 3 LinkText Button

		// 1.Click and Test Change Password

		// Click on Change Password

		Thread.sleep(2000);
		driver.findElement(By.linkText("Change Password")).click();

		// Test Change Password 3 TextBox & 1 Button

		// Test Current Password
		Thread.sleep(2000);
		driver.findElement(By.id("CurrentPassword")).sendKeys("12345678");

		// Test Password
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("123456789");

		// Test Confirm Password
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");

		// Test Change Button

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Change ']")).click();

		// Back
		Thread.sleep(2000);
		driver.navigate().back();

		// Back
		Thread.sleep(1000);
		driver.navigate().back();

		// End of Change Password Testing

		// 2. Click and Test Archive & Unarchive Account

		// Archive
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Archive account ']")).click();

		// Unarchive
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Unarchive account ']")).click();
		// 3. Click and Test Sign Out
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();

		// Close Browser
		Thread.sleep(1000);
		driver.close();

	}

}
                          // End of Sellers Setting Page Testing
