package mySecondDaySeleniumTestCase;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");	
	
	Map<String, Object> prefs = new HashMap<String, Object>();
	prefs.put("profile.default_content_setting_values.notifications", 2);
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);
	
	WebDriver driver = new ChromeDriver(options);
	
	try {
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("****");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("***********");
		
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		driver.findElement(By.id("userNavigationLabel")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.uiScrollableAreaContent")));
		
		// logout using form submit
		driver.findElement(By.cssSelector("._w0d[action='https://www.facebook.com/login/device-based/regular/logout/?button_name=logout&button_location=settings']")).submit();

		//logout using xpath - not recommended
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElements(By.xpath("//li[9]//a/span")).get(1).click();   
		
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
