package Assignment02;

import java.util.Scanner;

public class Application07 {

	public static void main(String[] args) {
		Candy07 c1=new Candy07();
		Cookie07 c2=new Cookie07();
		IceCream07 i1=new IceCream07();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your role");
		String role=sc.nextLine();
		if(role.equalsIgnoreCase("owner"))
		{
			String additem=sc.nextLine();
			System.out.println("New Item added "+additem);
		}
		else if(role.equalsIgnoreCase("customer"))
		{
			String ch=sc.nextLine();
			if(ch.equalsIgnoreCase("candy"))
			{
				System.out.println("You have ordered "+ch);
				c1.getCost();
			}
			else if(ch.equalsIgnoreCase("cookie"))
			{
				System.out.println("You have ordered "+ch);
				c2.getCost();
			}	
			else if(ch.equalsIgnoreCase("icecream"))
			{
				System.out.println("You have ordered "+ch);
				i1.getCost();
			}
		}

	}

}
