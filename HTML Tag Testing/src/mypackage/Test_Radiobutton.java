package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_Radiobutton extends Testclass {
  
	@Test
  public void TestRadioButton() {
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		List<WebElement> radiobutton=driver.findElements(By.name("gender"));
		boolean radio_button_value =false;
		radio_button_value=radiobutton.get(0).isSelected();
		
		if(radio_button_value==true)
			radiobutton.get(1).click();
		else
			radiobutton.get(0).click();
		
	
	}
}
