package pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class sample_reg extends Baseclass{
  
	
	@Test
  public void test() throws IOException {
		
		driver.findElement(By.id("text1")).sendKeys("first");
		driver.findElement(By.xpath(".//*[@id='text2']")).sendKeys("last");
		driver.findElement(By.id("text3")).sendKeys("hidden");
		driver.findElement(By.id("check1")).click();
		driver.findElement(By.id("check2")).click();
		WebElement rb=driver.findElement(By.id("radio1"));
		rb.click();
		Select sel=new Select(driver.findElement(By.id("Carlist")));
		sel.selectByValue("BMW Car");
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("scr.jpg"));
		System.out.println(f.getAbsolutePath());
		
	
		
		
			
  }

}
