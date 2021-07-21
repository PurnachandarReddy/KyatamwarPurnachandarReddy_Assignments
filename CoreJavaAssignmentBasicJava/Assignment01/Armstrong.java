package Assignment01;
import java.util.*;
public class Armstrong {
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	int r;
	int sum=0;
	while(n>0)
	{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
		
	}
	if(sum==temp)
	{
		System.out.println("it is an Armstrong number");
	}
	else
	{
		System.out.println("it is not an Armstrong number");
	}
	}
}
