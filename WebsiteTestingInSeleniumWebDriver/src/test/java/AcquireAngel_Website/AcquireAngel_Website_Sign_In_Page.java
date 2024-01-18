package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_Sign_In_Page {

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

		// Testing Sing In Page By Giving Seller & Buyer Account Address

		                     // Sign In As A Seller

		// Click on Email Address using id locator

		Thread.sleep(1000);
		driver.findElement(By.id("Email")).click();

		// Select and give Email Address using id locator

		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("trexton.haniel@milkcreeks.com");

		// Select Password using name locator

		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys("12345678");
		
		//Choose Remember Me using Xpath locator
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='IsRemember']")).click();

		// Select SignIn using CssSelector locator


		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block']")).click();

		
		// Back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		                       // Sign In As A Buyer

		// Select Email Address using id locator

		Thread.sleep(2000);

		driver.findElement(By.name("Email")).sendKeys("myranda.taleigh@milkcreeks.com");

		// Select Password using name locator

		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("12345678");
		
		//Choose Remember Me using Xpath locator
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='IsRemember']")).click();

		// Select SignIn Button using CssSelector locator


		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block']")).click();
		
		// Back
				Thread.sleep(2000);
				driver.navigate().back();
				
				//Refresh
				Thread.sleep(2000);
				driver.navigate().refresh();
				

		                   // End of TextBox Testing
		
				
			     /*	// Test Forgot Password Option
				
				 
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("a[title='Fill Email Field and Click it']")).click();
				
				// Give Email Address
				Thread.sleep(2000);
				driver.findElement(By.id("Email")).sendKeys("trexton.haniel@milkcreeks.com");
				
				// Click on Send Button
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[value='Send ']")).click();
				
				// Back
				Thread.sleep(2000);
				driver.navigate().back();
				
				// Back
				Thread.sleep(2000);
				driver.navigate().back();
				
				// Refresh 
				  Thread.sleep(1000);
				  driver.navigate().refresh();
				  
				         // End of Forgot Password Testing */
				  
				
		
		// Testing Sign In Page  SignIn & SignUp LinkText Button
		
		// 1. Testing The Sign In Upper SingIn LinkText
		Thread.sleep(2000);
		driver.findElement(By.linkText("SignIn")).click();

		// Refresh Page
		Thread.sleep(1000);
		driver.navigate().refresh();

	

		// 2. Testing The Below SingUp CSS Selector
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".text-info")).click();

		// Back To SignIn Page
		Thread.sleep(1000);
		driver.navigate().back();

// Testing The LinkdIn Button

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[title='Login using your LinkedIn account']")).click();

		// Back To SignIn Page
		Thread.sleep(1000);
		driver.navigate().back();
		
		// Refresh 
		  Thread.sleep(1000);
		  driver.navigate().refresh();
		  
		  
		// Go To Home Page By Click On AcquireAngel Logo Using CSS Selector

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".navbar-brand.js-scroll-trigger.text-black-50")).click();

		// Back To SignIn Page
		Thread.sleep(1000);
		driver.navigate().back();
		
		// Close Browser
		Thread.sleep(1000);
		driver.close();
	

	}

}
                            // End of Sign In Page Testing



	
