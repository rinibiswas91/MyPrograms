package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_dropdown_list extends Testclass {
  
	@Test
  public void Testdropdownlist() {
		
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		
		Select dropdown_list=new Select(driver.findElement(By.id("Carlist")));
		dropdown_list.selectByValue("BMW Car");
		
		int list_size=dropdown_list.getOptions().size();
		System.out.println("dropdown list size is :" + list_size);
		
		Assert.assertEquals(6,dropdown_list.getOptions().size());
		
  }
}
