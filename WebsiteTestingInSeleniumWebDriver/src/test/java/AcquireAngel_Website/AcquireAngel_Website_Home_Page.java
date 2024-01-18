package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_Home_Page {

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

		// Test Home Page Six Horizontal Navigation Bar Using LinkText

		// 1. Click Home Navigator Button

		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();

		// 2.Click For Sellers Navigator Button

		Thread.sleep(2000);
		driver.findElement(By.linkText("For Sellers")).click();

		// Back To Home Page
		Thread.sleep(1000);
		driver.navigate().back();

		// 3. Click For Buyers Navigator Button

		Thread.sleep(2000);
		driver.findElement(By.linkText("For Buyers")).click();

		// Back To Home Page
		Thread.sleep(1000);
		driver.navigate().back();

		// 4. Click About Navigator Button

		Thread.sleep(2000);
		driver.findElement(By.linkText("About")).click();

		// Back To Home Page
		Thread.sleep(1000);
		driver.navigate().back();

		// 5. Click SignIn Navigator Button

		Thread.sleep(2000);
		driver.findElement(By.linkText("SignIn")).click();

		// Back To Home Page
		Thread.sleep(1000);
		driver.navigate().back();

		// 6. Click Join Now Navigator Button

		Thread.sleep(2000);
		driver.findElement(By.linkText("Join Now")).click();

		// Back
		Thread.sleep(2000);
		driver.navigate().back();

		// End Of Testing Home Page Horizontal Navigation Bar

		// Change/Test Home Page Side Image By Click on The Next Presentation
		// icon/button with ClassName locator

		Thread.sleep(2000);
		driver.findElement(By.className("owl-next")).click();

		// Changing Home Page Side Image By Click on The Previous Presentation
		// icon/button with ClassName locator

		Thread.sleep(2000);
		driver.findElement(By.className("owl-prev")).click();

		// End of Image Testing

		// Click Home Page Center "Join Now" Button

		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Join N")).click();
		
		// Back To Home Page
				Thread.sleep(1000);
				driver.navigate().back(); 

		// Click The Video Play Button With CssSelector

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".icon-video.popup-vimeo.d-flex.justify-content-center.align-items-center"))
				.click();

		// Close The Video Play Button With CssSelector

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[title='Close (Esc)']")).click();
		
		// Refresh
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		 // Test Home Page Footer Socia Media Button & Email Box Using  Class Locator
		
		// Go To Footer Section
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ftco-footer.ftco-bg-dark.ftco-section")).click();
		

		// Test Footer 3 Social Media Button 
		
		// 1.Twitter Testing with CSS Selector

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".icon-twitter")).click();
		
		// Back To Home Page
		Thread.sleep(1000);
		driver.navigate().back(); 
		
		// 2. Facebook Testing with CSS Selector
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".icon-facebook")).click();
		
		// Back To Home Page
		Thread.sleep(1000);
		driver.navigate().back(); 
		
		// 3. Instagram Testing with CSS Selector
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".icon-instagram")).click();
		  
		               // End of Social Media Testing
		
        // Click On The Email Address Box For Subscribe Acquireangel with CSS Selector
			
			// Refresh
			Thread.sleep(1000);
			driver.navigate().refresh(); 
			
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
			
			// Back To Home Page
			Thread.sleep(1000);
			driver.navigate().back(); 
			
			// Close Browser
			Thread.sleep(1000);
			driver.close();

	}

}
                           // End Of Home Page Testing
