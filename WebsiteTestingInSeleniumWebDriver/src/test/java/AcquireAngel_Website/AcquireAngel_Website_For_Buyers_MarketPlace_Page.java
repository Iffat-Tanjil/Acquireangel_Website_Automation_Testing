package AcquireAngel_Website;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_For_Buyers_MarketPlace_Page {

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
		
		// Select Buyers Email Address using id locator

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
				
				// Test MarketPlace Dashboard 4 Text Box, 1 Button, 2 LinkText
				
				// Test 4 Text Box and 1 Button
				
				// 1. Test Price Starts From, TextBox
				Thread.sleep(2000);
				driver.findElement(By.id("min_price")).sendKeys("$5000");
				
				
				// 2. Test Price Ends From, TextBox
				Thread.sleep(2000);
				driver.findElement(By.id("max_price")).sendKeys("$20000");

				
				// 3. Test Number of Customers Dopdown  TextBox
				
				Select dropdown =new Select(driver.findElement(By.id("customer_number")));
				
				Thread.sleep(1000);
				dropdown.selectByVisibleText("10-100");

				// 4. Test Keywords TextBox
				
				Thread.sleep(2000);
				driver.findElement(By.id("searchbox")).sendKeys("IT, Software Firm, Innovation");
				
                //  Test Clear Button
				
				Thread.sleep(2000);
				driver.findElement(By.id("reload")).click();
				
		         	//  Refresh
				
							Thread.sleep(2000);
							driver.navigate().refresh();
							
							// Click on Open To Offer Button
							
							Thread.sleep(2000);
							driver.findElement(By.cssSelector("div[class='col-md-12'] div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(2) input:nth-child(1)")).click();

							//  Refresh
							
							Thread.sleep(2000);
							driver.navigate().refresh();
							
							// Click On Description Arrow Button
							Thread.sleep(2000);
							driver.findElement(By.cssSelector("div[class='col-md-12'] div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(3) a:nth-child(1) i:nth-child(1)")).click();
							
							// Click On Request Private Information Message Box
							Thread.sleep(2000);
							driver.findElement(By.id("Message")).sendKeys("Hi..");
							
							// Click on Send Request Button
							Thread.sleep(2000);
							driver.findElement(By.cssSelector("button[type='submit']")).click();
							
							// Click on Proceed To Chat
							Thread.sleep(2000);
							driver.findElement(By.linkText("Proceed to chat")).click();
							
							// Click and write a Text
							Thread.sleep(2000);
							driver.findElement(By.cssSelector("#Message")).sendKeys("Please eloborate about this startup");
							
							// Click on send message icon
							Thread.sleep(2000);
							driver.findElement(By.cssSelector("#btnSendMessage")).click();
							
							// Back 
							Thread.sleep(2000);
							driver.navigate().back();
							
							//close browser
							Thread.sleep(2000);
							driver.close();
						
	}

}
                           // End of Buyer MarketPlace Testing
