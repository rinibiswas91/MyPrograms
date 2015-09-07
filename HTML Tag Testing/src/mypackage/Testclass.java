package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Testclass {
  
	WebDriver driver=new FirefoxDriver();
		
  @BeforeTest
  public void beforeTest() {
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  
	  driver.quit();
  }

}
