package pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class login_test {
	
	WebDriver driver=new FirefoxDriver();
	
  @Test
  public void test() {
	  driver.findElement(By.id("Email")).sendKeys("aniket.purandare@synerzip.com");
	  WebElement element=driver.findElement(By.id("next"));
	  if(element.isEnabled())
	  {
		  System.out.println("clicked");
		  driver.findElement(By.id("next")).submit();
		  driver.findElement(By.id("Passwd")).sendKeys("Synerzip");
		  driver.findElement(By.id("signIn")).submit();
		  driver.findElement(By.className("gb_Ma")).click();
		  driver.findElement(By.id("gb_71")).click();
	  } 
	  else
		  System.out.println("error or disabled");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://www.gmail.com");
  }

  @AfterTest
  public void afterTest() {
	/*  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	//driver.quit();
  }

}
