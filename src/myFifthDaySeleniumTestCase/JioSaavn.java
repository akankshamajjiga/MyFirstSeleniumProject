package myFifthDaySeleniumTestCase;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JioSaavn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https://www.jiosaavn.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".rbt-input-main.form-control.rbt-input")).click();
	
		driver.findElement(By.cssSelector(".rbt-input-main.form-control.rbt-input")).sendKeys("Khairiyat");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector(".rbt-input-main.form-control.rbt-input")).sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    System.out.println(driver.findElements(By.cssSelector("div.infinite-scroll-component section ol li figcaption")).size());
	    
	    //driver.findElements(By.cssSelector("div.infinite-scroll-component section ol li figcaption")).get(0).click();
	    
	    driver.findElement(By.linkText("Khairiyat")).click();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.findElement(By.cssSelector("div.c-toast__msg span")).click();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.findElement(By.linkText("Play")).click();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	   System.exit(0);
	}
}
