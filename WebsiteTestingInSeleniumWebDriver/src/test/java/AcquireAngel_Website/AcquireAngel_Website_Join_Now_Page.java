package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_Join_Now_Page {

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

		// Testing Sing Up Page By createing Seller Account

		// Select Seller Radio Button
		
		Thread.sleep(1000);
		driver.findElement(By.id("Seller")).click();

		// Click on Email Address using id locator

		Thread.sleep(1000);
		driver.findElement(By.id("Email")).click();

		// Select and give Email Address using id locator

		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("trexton.haniel@milkcreeks.com");

		// Select Password using name locator

		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys("12345678");

		// Select SignUp using CssSelector locator

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block']")).click();

		// Testing SingUp Page By Creating Buyer Account

		// Select Buyer Radio Button
        
		Thread.sleep(2000);
		driver.findElement(By.id("Buyer")).click();

		// Select Email Address using id locator

		Thread.sleep(2000);

		driver.findElement(By.name("Email")).sendKeys("myranda.taleigh@milkcreeks.com");

		// Select Password using name locator

		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("12345678");

		// Select SignUp using CssSelector locator

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block']")).click();

		                   // End of TextBox Testing
		
		// Testing Join Now Page All (2) SignIn LinkText Button
		
		// 1. Testing The Join Now Upper SingIn LinkText
		Thread.sleep(1000);
		driver.findElement(By.linkText("SignIn")).click();

		// Back To SignUp Page
		Thread.sleep(1000);
		driver.navigate().back();

		// Refresh
		Thread.sleep(1000);
		driver.navigate().refresh();

		// 2. Testing The Below SingIn CSS Selector
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".text-info")).click();

		// Back To SignUp Page
		Thread.sleep(1000);
		driver.navigate().back();

// Testing The LinkdIn Button

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[title='Login using your LinkedIn account']")).click();

		// Back To SignUp Page
		Thread.sleep(1000);
		driver.navigate().back();
		
		// Refresh 
		  Thread.sleep(1000);
		  driver.navigate().refresh();
		  
		  
		// Go To Home Page By Click On AcquireAngel Logo Using CSS Selector

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".navbar-brand.js-scroll-trigger.text-black-50")).click();

		// Back To SignUp Page
		Thread.sleep(1000);
		driver.navigate().back();
		
		// Close Browser
		Thread.sleep(1000);
		driver.close();

		

	}

}
                            // End of Join Now Page Testing
