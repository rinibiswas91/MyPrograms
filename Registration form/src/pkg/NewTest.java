package pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver=new FirefoxDriver();
	
	@Test
  public void test() {
		driver.findElement(By.id("free-trial-trigger")).click();
		driver.findElement(By.id("UserFirstName")).sendKeys("abc");
		driver.findElement(By.id("UserLastName")).sendKeys("aaa");
		driver.findElement(By.xpath("//*[@id='form-container']/ul/li[10]/div/div[2]/a/span[2]")).click();
		driver.findElement(By.xpath("html/body/ul[1]/li[10]/a")).click();
		driver.findElement(By.id("UserEmail")).sendKeys("abc@example.com");
		driver.findElement(By.id("UserPhone")).sendKeys("02 98754632");
		driver.findElement(By.id("CompanyName")).sendKeys("syn");
		driver.findElement(By.xpath("//*[@id='form-container']/ul/li[14]/div/div[2]/a/span[2]")).click();
		driver.findElement(By.xpath("html/body/ul[2]/li[6]/a")).click();
		driver.findElement(By.id("SubscriptionAgreement")).click();
		driver.findElement(By.xpath("//*[@id='form-container']/div[2]/a")).submit();
		

  }
  
	@BeforeTest
  public void beforeTest() {
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.salesforce.com");
  }

  
	@AfterTest
  public void afterTest() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
  }

}
