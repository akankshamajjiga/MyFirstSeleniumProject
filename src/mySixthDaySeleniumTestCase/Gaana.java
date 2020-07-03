package mySixthDaySeleniumTestCase;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gaana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		try {
		
		driver.get("https://gaana.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElements(By.cssSelector(".popup-close")).get(0).click();
		
		driver.findElements(By.cssSelector(".popup-close")).get(0).click();
		
		driver.findElements(By.cssSelector(".ui-autocomplete-input")).get(0).click();
		
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("nee kannu neeli samudram");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElements(By.cssSelector("li.list.loaded")).get(0).click();
		
		}
		
		catch(Exception e) {
			
			System.out.println(e.toString());
		}
		
		finally {
					
		System.exit(0);
		
		}
	}
}

