package Assignment01;
import java.util.*;

public class Searching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[15];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the number to be searched: ");
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("the number "+key+" is found in the array ");
			}
			
		}
		

	}

}
