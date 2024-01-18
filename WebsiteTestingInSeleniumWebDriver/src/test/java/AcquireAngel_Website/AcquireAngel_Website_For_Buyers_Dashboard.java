package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_For_Buyers_Dashboard {

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
						
						
						 //Testing The Horizontal Navigation Bar From Buyer Dashboard
				    		
			    		 // Click Private Requests Navigator Button
			    		
					     Thread.sleep(2000);
					       driver.findElement(By.linkText("Private requests")).click();
					       
					    // Back
							Thread.sleep(1000);
							driver.navigate().back();
					       
				
				  	
					        // Click MarketPlace Navigator Button
					
							Thread.sleep(2000);
							driver.findElement(By.linkText("Marketplace")).click();
							
							// Back
							Thread.sleep(1000);
							driver.navigate().back();
							
						
							
							// Click Settings Navigator Button
							
							Thread.sleep(2000);
							driver.findElement(By.linkText("Settings")).click();
							
							// Back
							Thread.sleep(1000);
							driver.navigate().back();
							
							
							
						       // End Of Navigation Bar Testing
						
						// Test Buyers Contract Info
						// Test Buyers Dashboard 5 TextBox, 1 Button, 1 LinkText
						
						// Test Upload Image LinkText
						Thread.sleep(2000);
						driver.findElement(By.cssSelector(".label-btn1")).click();
						
						// Test 5 TextBox
						
						// 1.Click & Give Data ON First Name Text Box
						Thread.sleep(4000);
						driver.findElement(By.id("FirstName")).sendKeys("Mr.Orange");
						
						// 2.Click & Give Data ON Last Name Text Box
						Thread.sleep(2000);
						driver.findElement(By.id("LastName")).sendKeys("Clark");
						
						// 3.Click & Give Data ON  Email Text Box
						Thread.sleep(2000);
						driver.findElement(By.id("Email")).sendKeys("myranda.taleigh@milkcreeks.com");
						
						// 4.Click & Give Data ON LinkedIn Text Box
						Thread.sleep(2000);
						driver.findElement(By.id("LinkedinProfile")).sendKeys("https://bd.linkedin.com/");
						
						// 5.Click & Give Data ON LinkedIn Text Box
						Thread.sleep(2000);
						driver.findElement(By.id("Shortbio")).sendKeys("Mr. Orange Clark is a notable individual who deserves recognition. His contributions and achievements have left a lasting impact on those around him. With his exceptional skills and dedication, he has become a role model for many. Mr. Clark's remarkable character and accomplishments make him a truly remarkable person.");
						
						// 4.Click & Give Data ON Save Change Button
						Thread.sleep(2000);
						driver.findElement(By.cssSelector("input[value='Save changes']")).click();
						
						// Back
						//Thread.sleep(1000);
						//driver.navigate().back();
						
						// Refresh
						//Thread.sleep(1000);
						//driver.navigate().refresh();
						
						
		                 // Click on Log Out Button
					
						Thread.sleep(4000);
						driver.findElement(By.linkText("Sign Out")).click();
						
						// Close Browser
						Thread.sleep(1000);
						driver.close();

	}

}
