package AcquireAngel_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcquireAngel_Website_About_Page {

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

		// Go To About Page

		Thread.sleep(2000);
		driver.findElement(By.linkText("About")).click();

		// Test About Page Five Horizontal Navigation Bar Using LinkText

		// 1. Click Home Navigator Button From About Page

		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();
		
		//Back To About Page
		Thread.sleep(2000);
		driver.navigate().back();

		// 2. Click For Sellers Navigator Button From About Page

		Thread.sleep(2000);
		driver.findElement(By.linkText("For Sellers")).click();

		//Back To About Page
				Thread.sleep(2000);
				driver.navigate().back();


		// 3. Click For Buyers Navigator Button From About Page

		Thread.sleep(1000);
		driver.findElement(By.linkText("For Buyers")).click();

		//Back To About Page
				Thread.sleep(2000);
				driver.navigate().back();


		// 4. Click SignIn Navigator Button From About Page

		Thread.sleep(2000);
		driver.findElement(By.linkText("SignIn")).click();

		//Back To About Page
				Thread.sleep(2000);
				driver.navigate().back();

		// 5. Click Join Now Navigator Button From About Page

		Thread.sleep(2000);
		driver.findElement(By.linkText("Join Now")).click();

		//Back To About Page
				Thread.sleep(2000);
				driver.navigate().back();

		// End Of Testing About Page Horizontal Navigation Bar

		// Click on Image Changing Icon

		// De-Active
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='owl-dot']")).click();

		// Refresh
		Thread.sleep(1000);
		driver.navigate().refresh();

		// Active

		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".owl-dot.active")).click();

		// Test About Page Footer Socia Media Button & Email Box Using Class Locator

		// Go To Footer Section
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ftco-footer.ftco-bg-dark.ftco-section")).click();

		// Test Footer 3 Social Media Button

		// 1.Twitter Testing with CSS Selector From About Page

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".icon-twitter")).click();

		// Back
		Thread.sleep(1000);
		driver.navigate().back();

		// 2. Facebook Testing with CSS Selector  From About Page

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".icon-facebook")).click();

		// Back
		Thread.sleep(1000);
		driver.navigate().back();

		// 3. Instagram Testing with CSS Selector  From About Page

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

		// Click On Email Box  From About Page
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Enter email address']")).click();

		// Write Email Address  From About Page
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
                      // End of About Page Testing
