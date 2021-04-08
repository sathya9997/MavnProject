package org.tool;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@BeforeClass
	public void beforeclass() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathya Bharathi R S\\Sathya Eclipse\\FrameWork\\MavnProject\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/index.php");
	 driver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterclass() {
		driver.quit();
	}
	
	@BeforeMethod
	public void beforemethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@AfterMethod
	public void aftermethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void test() {
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("sathya");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
