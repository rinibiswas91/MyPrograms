package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_FileUpload extends Testclass{
 
	@Test
  public void testFileUpload() {
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		WebElement filePath=driver.findElement(By.name("img"));
		filePath.sendKeys("demo.c");
		
  }
}
