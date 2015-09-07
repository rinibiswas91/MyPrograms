package mypackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Textbox extends Testclass {
  
	@Test
  public void Testtextbox() {
	  driver.get("http://salesforce.com");
	  driver.findElement(By.id("free-trial-trigger")).click();
	  driver.findElement(By.id("UserFirstName")).sendKeys("abc");
	  driver.findElement(By.id("UserLastName")).sendKeys("aaa");
	  String actual_first_name=driver.findElement(By.id("UserFirstName")).getText();
	  String actual_last_name=driver.findElement(By.id("UserLastName")).getText();
	  Assert.assertEquals(actual_first_name,"abc");
	  Assert.assertEquals(actual_last_name,"aaa");
	  System.out.println("assert completed");

  }
}
