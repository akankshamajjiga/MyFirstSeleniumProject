package myNinthSeleniumTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_m")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_m")).sendKeys("thasmith");
		
		driver.findElement(By.id("u_0_o")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_o")).sendKeys("vadhodara");
		
		driver.findElement(By.id("u_0_r")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_r")).sendKeys("thasmith_vadhodara@gmail.com");
		
		driver.findElement(By.id("password_step_input")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("password_step_input")).sendKeys("@thasmith18");
		
		driver.findElement(By.id("u_0_u")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_u")).sendKeys("thasmith_vadhodara@gmail.com");
		
		driver.findElement(By.id("day")).click();
		
		driver.findElement(By.id("day")).sendKeys("5");
		
		driver.findElement(By.id("day")).click();
		
		driver.findElement(By.id("month")).click();
		
		driver.findElement(By.id("month")).sendKeys("Aug");
		
		driver.findElement(By.id("month")).click();
		
		driver.findElement(By.id("year")).click();
		
		driver.findElement(By.id("year")).sendKeys("1995");
		
		driver.findElement(By.id("year")).click();
		
		driver.findElement(By.id("u_0_6")).click();
		
		driver.findElement(By.id("u_0_12")).click();
		
		}
		 
	    catch(Exception e) {
	    		
	    	System.out.println(e.toString());
	    }
		
		finally {
	   
          // driver.quit();
        
          System.exit(0);
		
	}
	
	  }

   }
