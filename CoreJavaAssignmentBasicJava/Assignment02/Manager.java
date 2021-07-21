package Assignment02;
import java.util.*;
public class Manager extends Employee{

	public void totalSalary()
	{
		Scanner sc=new Scanner(System.in);
		int perDayChargesOfManager=1000;
		System.out.println("Enter Incentive");
		int incentive=sc.nextInt();
		
		int salaryOfManager=(30*perDayChargesOfManager)+incentive;
		System.out.println("Salary of manager is "+salaryOfManager);
	}
}
