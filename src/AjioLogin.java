import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjioLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ajio.com/");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".login-form.login-modal")).click();
		
		driver.findElement(By.cssSelector(".username")).sendKeys("*************");
		
		driver.findElement(By.cssSelector(".login-btn")).click();

		WebDriverWait wait = new WebDriverWait(driver,20);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".login-form-inputs.hide-pwd-otp")));
	    
		driver.findElement(By.cssSelector(".login-form-inputs.hide-pwd-otp")).sendKeys("*********");
		
		driver.findElement(By.cssSelector(".login-form-inputs.login-btn")).click();
	
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Sign Out"))));
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sign Out")).click();
	
   }
}
