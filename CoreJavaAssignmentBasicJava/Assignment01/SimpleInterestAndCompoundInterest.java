package Assignment01;

import java.util.Scanner;

public class SimpleInterestAndCompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		int no=sc.nextInt();
		int simpleInterest = (p*n*r)/100;
		double compoundInterest = p*(Math.pow((1+r/100),(n*no)));
		System.out.println("The Simple Interest is :"+simpleInterest);
		System.out.println("The Compound Interest is :"+compoundInterest);

	}

}
