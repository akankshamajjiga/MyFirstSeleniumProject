package myTenthDaySeleniumTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BharatAppRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
		
		driver.get("https://nameless-cove-81024.herokuapp.com/");
		
		driver.manage().window().maximize();
		
	    WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".nav-link")));
		
		driver.findElement(By.linkText("Register")).click();
		
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("chachi");
	    
	    driver.findElement(By.cssSelector("input[type='email']")).sendKeys("learnerChachi@gmail.com");
	    
	    driver.findElements(By.cssSelector("input[type='password']")).get(0).sendKeys("Aku@1997");
	    
	    driver.findElements(By.cssSelector("input[type='password']")).get(1).sendKeys("Aku@1997");
	    
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
		
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	    
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("learnerChachi@gmail.com");
		
		driver.findElements(By.cssSelector("input[type='password']")).get(0).sendKeys("Aku@1997");
		
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		driver.findElement(By.linkText("Logout")).click();
			
		}
		
		catch(Exception e) {
			
		System.out.println(e.toString());
		
		}
		 
		finally {
			
	  //driver.quit();
		
		System.exit(0);
		
       }
  
	}
		
}
