package mySeventhDaySeleniumTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 try {
		 
		 driver.get("https://www.youtube.com/");
		 
		 driver.manage().window().maximize();
		 
         driver.findElement(By.cssSelector("div.ytd-searchbox-spt")).click();
         
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         
         driver.findElement(By.cssSelector("input[id='search']")).sendKeys("super cute song bheeshma");
         
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         
         driver.findElement(By.cssSelector("button.style-scope.ytd-searchbox")).sendKeys(Keys.ENTER);
         
         driver.findElement(By.cssSelector(".text-wrapper.style-scope.ytd-video-renderer")).click();
         
		 }
		 
		 catch(Exception e) {
			 
			 System.out.println(e.toString());
		 }
         
		 finally {
			 
			 System.exit(0);
			 
		 }    
         
	}
	 
}
