package mypackage;

public class Emp_info {

	public double appr(Emp_details emp)
	{
		double appraisal = 0;
	      
	      if(emp.getSalary() < 10000){
	         appraisal = 500;
	         
	      }else{
	         appraisal = 1000;
	      }
	      
	      return appraisal;
	}
}
