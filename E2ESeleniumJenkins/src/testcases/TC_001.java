package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	
   @Test
	public void testcase1() {
		
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://thetestingworld.com/testings/");
		driver.findElement(By.name("fld_email")).sendKeys("hello");
		driver.findElement(By.name("fld_password")).sendKeys("hello");
		
		
	}

}
