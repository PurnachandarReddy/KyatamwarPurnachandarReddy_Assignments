package Assignment02;
import java.util.*;
public class Labour extends Employee{
	public void totalSalary() {
		int perDayChargesOfLabour=500;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Overtime in hours");
		int overTime=sc.nextInt();
		int salaryOfLabour=(30*perDayChargesOfLabour)+(overTime*50);
		System.out.println("Salary of manager is "+salaryOfLabour);
	}

}
