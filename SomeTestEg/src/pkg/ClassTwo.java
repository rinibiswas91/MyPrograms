package pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ClassTwo  extends pkg.BaseClassOne{
	@Test
	  public void testmethodone() {
	  driver.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	  String title = driver.getTitle();
	  System.out.print("\nCurrent page title is : "+title);
	  String Workdir = System.getProperty("user.dir");
	  String Classpackname = this.getClass().getName();
	  System.out.print("\n'"+Workdir+" -> "+Classpackname+" -> testmethodone' has been executed successfully");
	 }
	}

