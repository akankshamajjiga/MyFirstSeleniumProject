package myFifthDaySeleniumTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NetFlixLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
		
		driver.get("https://www.netflix.com/in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("**************");
		
		driver.findElement(By.cssSelector(".btn.btn-red.nmhp-cta.nmhp-cta-extra-large.btn-none.btn-custom")).click();
	
	    WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("*********");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.cssSelector("a.authLinks.signupBasicHeader")).click();
		
		}
		
		catch(Exception e) {
			
			System.out.println(e.toString());
			
		}
		
		finally {
			
			driver.quit();	
			
			System.exit(0);
		}
	}

}
