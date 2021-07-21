package Assignment01;
import java.util.*;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1[]=new int[3];
		int s2[]=new int[3];
		int s3[]=new int[3];
		int total1=0;
		int total2=0;
		int total3=0;
		
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=sc.nextInt();
		}
		for(int i=0;i<s1.length;i++)
		{
			total1=total1+s1[i];
		}
		System.out.println("the total scored :"+total1);
		System.out.println("the average of student1 is :"+total1/3);
		for(int i=0;i<s2.length;i++)
		{
			s2[i]=sc.nextInt();
		}
		for(int i=0;i<s2.length;i++)
		{
			total2=total2+s2[i];
		}
		System.out.println("the total scored :"+total2);
		System.out.println("the average of student2 is :"+total2/3);
		for(int i=0;i<s3.length;i++)
		{
			s3[i]=sc.nextInt();
		}
		for(int i=0;i<s3.length;i++)
		{
			total3=total3+s3[i];
		}
		System.out.println("the total scored :"+total3);
		System.out.println("the average of student3 is :"+total3/3);
		int n=0;
		for (int i=0;i<s1.length;i++)
		{
			int sum=0;
			sum=(s1[i]+s2[i]+s3[i]);
			int avg=sum/3;
			System.out.println("The sum of subject "+ ++n +" is "+ sum+"and the average of that subject is "+avg);
		}

	}

}
