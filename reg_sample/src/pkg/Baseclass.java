package pkg;

import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Baseclass {
	
	WebDriver driver=null;
	
	
  @BeforeTest
  public void beforetest() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
  }

  @AfterTest
  public void aftertest() {
	  driver.quit();
  }

}
