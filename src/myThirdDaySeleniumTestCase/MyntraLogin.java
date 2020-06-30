package myThirdDaySeleniumTestCase;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://accounts.myntra.com/login/");
		
		driver.manage().window().maximize();
	
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("learnerChachi@gmail.com");
		
	    driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='password']")));
	    
	    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Aku@1997");
	    
	    driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	    
	    driver.quit();
	    
	   
	}
   
}
