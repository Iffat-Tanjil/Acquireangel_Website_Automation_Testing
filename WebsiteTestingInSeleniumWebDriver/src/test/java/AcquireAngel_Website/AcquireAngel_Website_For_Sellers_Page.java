package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_For_Sellers_Page {

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
		
		// Go To For Sellers Page
		Thread.sleep(1000);
		driver.findElement(By.linkText("For Sellers")).click();
		
		// Test  Sellers Page Five Horizontal Navigation Bar Using LinkText
		

				// 1. Click Home Navigator Button From Sellers Page

				Thread.sleep(2000);
				driver.findElement(By.linkText("Home")).click();
				
				// Back 
				Thread.sleep(1000);
				driver.navigate().back();


				// 2. Click For Buyers Navigator Button From Sellers Page

				Thread.sleep(2000);
				driver.findElement(By.linkText("For Buyers")).click();

				// Back 
				Thread.sleep(1000);
				driver.navigate().back();

				// 3. Click About Navigator Button From Sellers Page

				Thread.sleep(2000);
				driver.findElement(By.linkText("About")).click();

				// Back 
				Thread.sleep(1000);
				driver.navigate().back();

				// 4. Click SignIn Navigator Button From Sellers Page

				Thread.sleep(2000);
				driver.findElement(By.linkText("SignIn")).click();

				// Back To  Page
				Thread.sleep(1000);
				driver.navigate().back();

				// 5. Click Join Now Navigator Button From Sellers Page

				Thread.sleep(2000);
				driver.findElement(By.linkText("Join Now")).click();

				// Back
				Thread.sleep(2000);
				driver.navigate().back();

				// End Of Testing For Sellers Page Horizontal Navigation Bar
				

				// Click For Sellers Page Center "Join Now" Button From Sellers Page

				Thread.sleep(3000);
				driver.findElement(By.partialLinkText("Join N")).click();
				
				// Back To Page
						Thread.sleep(1000);
						driver.navigate().back(); 
						
						
						 // Test For Sellers Page Footer Socia Media Button & Email Box Using  Class Locator
						
						// Go To Footer Section
						Thread.sleep(2000);
						driver.findElement(By.cssSelector(".ftco-footer.ftco-bg-dark.ftco-section")).click();
						

						// Test Footer 3 Social Media Button 
						
						// 1.Twitter Testing with CSS Selector

						Thread.sleep(2000);
						driver.findElement(By.cssSelector(".icon-twitter")).click();
						
						// Back 
						Thread.sleep(1000);
						driver.navigate().back(); 
						
						// 2. Facebook Testing with CSS Selector
						
						Thread.sleep(2000);
						driver.findElement(By.cssSelector(".icon-facebook")).click();
						
						// Back 
						Thread.sleep(1000);
						driver.navigate().back(); 
						
						// 3. Instagram Testing with CSS Selector
						
						Thread.sleep(2000);
						driver.findElement(By.cssSelector(".icon-instagram")).click();
						  
						               // End of Social Media Testing
						
				        // Click On The Email Address Box For Subscribe Acquireangel with CSS Selector
							
							// Back
							Thread.sleep(1000);
							driver.navigate().back(); 
							
							// Go To Footer Section Again
							Thread.sleep(2000);
							driver.findElement(By.cssSelector(".ftco-footer.ftco-bg-dark.ftco-section")).click();
							
							
							// Click On Email Box
							Thread.sleep(2000);
							driver.findElement(By.cssSelector("input[placeholder='Enter email address']")).click();
							
							// Write Email Address
							Thread.sleep(2000);
							driver.findElement(By.cssSelector("input[placeholder='Enter email address']")).sendKeys("gift@gmail.com");
							
							
							// Click On The Subscribe Button For Subscribe Acquireangel with CSS Selector
							
							Thread.sleep(1000);
							driver.findElement(By.cssSelector("input[value='Subscribe']")).click();
							
							// Back To Previous Page
							Thread.sleep(1000);
							driver.navigate().back(); 
							
							// Close Browser
							Thread.sleep(1000);
							driver.close();
	}

}
                            // End Of For Sellers Page Testing
