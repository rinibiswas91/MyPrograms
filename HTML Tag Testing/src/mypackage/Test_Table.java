package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_Table extends Testclass {
  
	@Test
  public void testTable() {
	
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		WebElement table=driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody"));
		List<WebElement> table_rows=table.findElements(By.tagName("tr"));
		int row_count=table_rows.size();
		for(int row=0;row<row_count;row++)
		{
			List<WebElement> table_column=table_rows.get(row).findElements(By.tagName("td"));
			int column_count=table_column.size();
			for(int column=0;column<column_count;column++)
			{
				String cellData=table_column.get(column).getText();
				System.out.println("value of cell at row " + row + " and column " + column + " is " + cellData);
			}
			System.out.println("************************************************");
			
		}
		
  }
}
