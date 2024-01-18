package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_For_Sellers_Add_Info_Page {

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
				
				//Choose Remember Me using Xpath locator
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='IsRemember']")).click();

				// Select SignIn Button using CssSelector locator


				Thread.sleep(1000);
				driver.findElement(By.cssSelector("button[class='btn btn-primary btn-block']")).click();
				
				
				// Testing The Horizontal Navigation Bar From Seller Dashboard
	    		
	    		 //  1. Click Private Requests Navigator Button
	    		
			     Thread.sleep(2000);
			       driver.findElement(By.linkText("Private requests")).click();
			       
		
		  	
			        // 2. Click MarketPlace Navigator Button
			
					Thread.sleep(2000);
					driver.findElement(By.linkText("Marketplace")).click();
					
				
					
					// 3. Click Settings Navigator Button
					
					Thread.sleep(2000);
					driver.findElement(By.linkText("Settings")).click();
					
					
					
					
					
					        // End Of Navigation Bar Testing
					
					
					// Now Testing Add Info All TextBox & Button
					//Add Info Has 3 TextBox & One Button
					
			    
		                // 1. Click & Test StartUp Name By Name Locator
			        	
			    		Thread.sleep(1000);
			    		driver.findElement(By.name("StartupName")).sendKeys("Tech_BD");
			    		
			    		
			    		//  2. Click & Test Email by ID locator
			    		
			    		Thread.sleep(2000);
			    		driver.findElement(By.id("Email")).sendKeys("trexton.haniel@milkcreeks.com");
			    		
		                //  2. Click & Test Website by ID locator
			    		
			    		Thread.sleep(2000);
			    		driver.findElement(By.id("Website")).sendKeys("Tech_BD.XYZ");
			    		
			    		// Select Save using CssSelector locator
			    		
			    		Thread.sleep(1000);
			    		driver.findElement(By.cssSelector("input[value='Save']")).click();
			    		
			    		// Click Sign Out Navigator Button
						
						Thread.sleep(2000);
						driver.findElement(By.linkText("Sign Out")).click();
					
			    		//Browser close
			    		Thread.sleep(1000);
			    		driver.close();
	}

}
                                  // End of Sellers Add Info Page Testing
