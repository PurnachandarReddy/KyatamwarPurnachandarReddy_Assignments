package Assignment02;
import java.util.*;
public class Saving extends AccountType{
	public void totalCash()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fixed deposit");
		int fixed=sc.nextInt();
		System.out.println("Enter intrest rate");
		int intrest=sc.nextInt();
		System.out.println("Enter fixed deposit for number of months");
		int timeMonths=sc.nextInt();
		int cash=(fixed*intrest*timeMonths)/100;
		int totalAmount=cash+fixed;
		System.out.println("Total Savings amount is "+totalAmount);
	}
}
