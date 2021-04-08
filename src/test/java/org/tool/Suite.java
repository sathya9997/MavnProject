package org.tool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Suite {
	WebDriver driver;
	
	@Parameters({"mal","pass"})
	@Test
	public void tc1(@Optional("abc@gmail.com")String mail,String pass) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathya Bharathi R S\\Sathya Eclipse\\FrameWork\\MavnProject\\drivers\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         WebElement txtEmail = driver.findElement(By.id("email"));
         txtEmail.sendKeys(mail);
         WebElement txtPass = driver.findElement(By.id("pass"));
         txtPass.sendKeys(pass);
	}

}
