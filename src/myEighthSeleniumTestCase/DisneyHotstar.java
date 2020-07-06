package myEighthSeleniumTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisneyHotstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
		
		driver.get("https://www.hotstar.com/in/disneyplus");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[type='search']")).click();
		
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("chhichhore");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("div.search-wrap")).click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        driver.findElement(By.linkText("Watch Movie")).click();
       
	
	}

		catch(Exception e) {
			
			System.out.println(e.toString());
			
		}
		
	   finally {
		   
		   System.exit(0);
	   }
		
	}
}
