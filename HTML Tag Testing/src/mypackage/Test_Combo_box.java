package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Combo_box extends Testclass {
  
	@Test
  public void testComboBox() {
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		Select combobox=new Select(driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[1]/select")));
		/*combobox.selectByValue("USA");
		combobox.selectByValue("India");
		combobox.selectByValue("Germany");*/
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(combobox.getOptions().get(1))
			.click(combobox.getOptions().get(2)).click(combobox.getOptions().get(3))
			.keyUp(Keys.CONTROL);
		builder.build().perform();
		driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[2]/input[1]")).click();
		
		
  }
}
