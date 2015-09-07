package mypackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Emp_test {
  Emp_details emp=new Emp_details();
  Emp_info e=new Emp_info();

  @Test
  public void test_emp() {
	  emp.setAge(22);
	  emp.setName("aa");
	  emp.setSalary(1000);
	  
	  double a=e.appr(emp);
	  Assert.assertEquals(500,a,0.0,"500");
	  
  }
}
