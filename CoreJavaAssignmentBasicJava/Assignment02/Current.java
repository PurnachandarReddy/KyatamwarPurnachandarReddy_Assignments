package Assignment02;
import java.util.*;
public class Current extends AccountType{
	public void totalCash()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter credit cash");
		int credit=sc.nextInt();
		System.out.println("Total Credit in the Acoount is "+credit);
	}

}
