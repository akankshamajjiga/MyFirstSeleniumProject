package myFirstDaySeleniumTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* If we are instantiating webdriver with chrome driver,
		  than we need to tell webdriver the location of chrome driver for it open chrome browser.
		  Webdriver will read or know the path of chrome driver from "webdriver.chrome.driver".
		  So we use the below code  
		 */
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		// we use below code to tell WebDriver to open gmail url in chrome browser 
		driver.get("https://gmail.com/");
		
		// we use below code to maximize the browser window
		driver.manage().window().maximize();
		 
		// we use below code to find email input field element and enter email
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("***");
		
		// we use below code to find next button element and click on it.
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
		// we use below code to declare explicit wait with maximum timeout of 20 seconds
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		/* we use below code to tell WebDriver to wait for maximium of 20 seconds for the
		 password field element to be clickable 
		*/
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='password']")));
		
		// we use below code to find password input field element and enter password
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("****");
		
		// we use below code to find next button element and click on it.
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
		//driver.close();
		
		//to close browser and WebDriver
		driver.quit();
		
		// to close program
		System.exit(0);
		
	}

}
