package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_Sellers_MyStartUp_Dashboard {

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
				
				

		    	  // Test My StartUp Page All Public Information TextBox & Button
				  // Public Information Has 6 TextBox with Drodown Button & 2 Button
		        	
		           // 1. Click & Test  About Company
		        	
		    		Thread.sleep(1000);
		    		driver.findElement(By.name("Startup.AboutCompany")).sendKeys("Tech-BD is an emerging software startup that is making waves in the industry. This innovative company is revolutionizing the tech world with its cutting-edge software solutions. With a strong focus on delivering high-quality products, Tech-BD is quickly gaining recognition for its exceptional services. ");
		    		
		    		
		    		//  2. Click & Test Annual Revenue by ID locator
		    		
		    		Thread.sleep(2000);
		    		driver.findElement(By.id("Startup_AnnualRecurringRevenue")).sendKeys("$2000");
		    		
		            // 3. Click & Test Number Of Customer Using Drop Down Button
		    		
		    		Select dropdown =new Select(driver.findElement(By.id("Startup_NumberOfCustomers")));
					
					Thread.sleep(2000);
					dropdown.selectByVisibleText("10-100");
					
		            // 4. Click & Test  Date Founded Using Drop Down Button
		    		
		    		Select dropdown1 =new Select(driver.findElement(By.id("Startup_FoundedYear")));
					
					Thread.sleep(2000);
					dropdown1.selectByIndex(31);
		    		
		            // 5.Click & Test Date Founded Using Drop Down Button
		    		
		    		Select dropdown2 =new Select(driver.findElement(By.id("Startup_FoundedMonth")));
					
					Thread.sleep(2000);
					dropdown2.selectByIndex(4);
					
					// 6.Click & Test Asking Price
					
					// Clear

		    		Thread.sleep(2000);
		    		driver.findElement(By.id("Startup_AskingPrice")).clear();
					
		    		//Give New Data
		    		Thread.sleep(1000);
		    		driver.findElement(By.id("Startup_AskingPrice")).sendKeys("100");
		    		
                    // Click & Test Open To Offer Slider Round Button 
		    		Thread.sleep(2000);
		    		driver.findElement(By.cssSelector(".slider.round")).click();
		    		
		    		
		            // 7.Click & Test StartUp Team Size
					
		    		//Clear
		    		Thread.sleep(2000);
		    		driver.findElement(By.id("Startup_StartupTeamSize")).clear();
		    		
		    		//Give Data
		    		Thread.sleep(1000);
		    		driver.findElement(By.id("Startup_StartupTeamSize")).sendKeys("10");
		    		
                   
		    		// Click Update Button using CssSelector locator
		    		
		    		Thread.sleep(1000);
		    		driver.findElement(By.cssSelector("form[id='publicInfoForm'] button[type='submit']")).click();
		    		
                       // End Of Public Information Testing 
		    		
		    		// Now Test Company features Section
		    		
		    		// Go To Page Center
		    		Thread.sleep(3000);
		    		driver.findElement(By.cssSelector("div[class='full-width float-left buffer-top5x']")).click();
		    		
		    		// Company features Has 4 TextBox, 2 LinkText, 1 Button 
		    		
		            // 1. Click & Test Growth Oppurtunity
		        
		    		Thread.sleep(3000);
		    		driver.findElement(By.name("Features.GrowthOpportunity")).sendKeys("Tech-BD, a software startup, offers immense growth opportunities for individuals seeking to excel in the tech industry");
		    		
		    		// 2.Click & Test On Growth Oppurtunity Highlight
		    		// Click
		    		Thread.sleep(2000);
		    		driver.findElement(By.xpath("//input[@id='GrowthOpportunityHighlights']")).click();
					
					
		    		
		    		//Give Data
		    		
		    		Thread.sleep(1000);
		    		driver.findElement(By.name("Features.GrowthOpportunityHighlights")).sendKeys("Tech-BD: Unleashing Growth Potential in the Software Startup Realm");
		    		
		    		
		    		// 3.Click & Test On Growth Oppurtunity Key Assets
		    		
		    		// Click
		    		Thread.sleep(2000);
		    		driver.findElement(By.cssSelector("#KeyAssetsHighlights")).click();
		    		
					
		    		//Give Data
		    		
		    		Thread.sleep(1000);
		    		driver.findElement(By.cssSelector("input[name='Features.KeyAssets']")).sendKeys("Tech-BD: Unlocking Growth Potential through Key Assets");
		    		
		    		// Delete Extra (if occured Extra Box then for delete use it)
		    		//Thread.sleep(2000);
		    		//driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).click();
		           
		    		// 4. Click & Test Keywords
		       	
		    		Thread.sleep(1000);
		    		driver.findElement(By.id("Features_Keywords")).sendKeys("Software Company, IT Company, Startup Technology, Innovation");
		    		
		          
		             // Click Update Button using CssSelector locator
		    		
		    		Thread.sleep(1000);
		    		driver.findElement(By.cssSelector("form[id='companyFeaturesForm'] button[type='submit']")).click();
		    		
		    	              	// End Of Growth Oppurtunity Testing
		    		
		    		
		    		// Now Test Selling Details 2 TextBox, 1 Button
		    		
		    		// Go To Page Footer
		    		Thread.sleep(3000);
		    		driver.findElement(By.cssSelector(".full-width.float-left.buffer-top5x.buffer-bottom4x")).click();
		    		

		            // 1. Click & Test Why are You Selling ?
		        	
		    		Thread.sleep(2000);
		    		driver.findElement(By.id("Details_Reason")).sendKeys("Our decision to sell the startup software company is influenced by various factors. One significant factor could be the changing market dynamics, where we believe that selling the company now would maximize its value");
		    		
		          // 2.  Click & Test Financial/Funding
		    		
		    		Thread.sleep(1000);
		    		driver.findElement(By.id("Details_Financial")).sendKeys("$5000");
		    		
		             // Click Update Button using CssSelector locator
		    		
		    		Thread.sleep(2000);
		    		driver.findElement(By.cssSelector("form[id='companySellingDetails'] button[type='submit']")).click();
		    		
				              // End of Testing Selling Details Section*/
		    		

		    		
		    		// Go To Page Bottom
		    		Thread.sleep(3000);
		    		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).click();
		    		
		    		// Now Click at Public Information Edit Link Text
		    		
		    		// Click At Edit LinkText
		    		
		    		Thread.sleep(2000);
		    		driver.findElement(By.id("btnEditPrivateInfo")).click();
		    		
		    		// Edit Has 3 Text Box , Click There And Click On Cancel LinkText
		    		
		    		 // 1. Click StartUp Name By Name Locator
		        	
		    		Thread.sleep(1000);
		    		driver.findElement(By.name("PrivateInfo.CompanyName")).click();
		    		
		    		// 2. Click Email by ID locator
		    		
		    		Thread.sleep(2000);
		    		driver.findElement(By.id("PrivateInfo_CompanyEmail")).click();
		    		
		    		
		            // 3. Click Website by ID locator
		    		
		    		Thread.sleep(2000);
		    		driver.findElement(By.id("PrivateInfo_Website")).click();
		    		
		    		// Click Update Button using CssSelector locator (Use It If Necessary)
		    		
		    		//Thread.sleep(1000);
		    	    //driver.findElement(By.xpath("//button[@id='bntUpdatePrivateInformation']")).click();
		    		

		    		// Click Cancel LinkText using CssSelector locator 
		    		
		    		Thread.sleep(2000);
		    		driver.findElement(By.cssSelector("#bntUpdateCancel")).click();
		    		
		    		// Test Pitch Deck Files Option
		    			
		    		// Click Upload File Option
		    		

		    		Thread.sleep(2000);
		    		driver.findElement(By.cssSelector("div[id='upload-file'] span")).click();
		    		
		    		
	              // Click on Delete Upload File 
		    		

		    		Thread.sleep(5000);
		    		driver.findElement(By.cssSelector(".btnDeleteFile")).click();
		        		
		    		
		    		   // Click on Sign Out Button
					
					Thread.sleep(4000);
					driver.findElement(By.linkText("Sign Out")).click();
					
		    		// Close Browser
		    		Thread.sleep(1000);
		    		driver.close();
	}
}
                        // End Of Sellers My Startup Dashboard Testing

