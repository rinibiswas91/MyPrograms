package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Checkbox extends Testclass{
 
	@Test
  public void Testcheckbox() {
		driver.get("http://http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		driver.findElement(By.id("check1")).click();
		driver.findElement(By.id("check2")).click();
		WebElement element=driver.findElement(By.id("check1"));
		Assert.assertFalse(element.isSelected());
	}
}
