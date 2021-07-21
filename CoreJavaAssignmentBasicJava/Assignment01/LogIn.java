package Assignment01;
import java.util.*;

public class LogIn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String user="Purnachandar";
		String pass="Purna";
		int count=3;
		for(int i=0;i<3;i++)
		{
			String username=sc.nextLine();
			String password=sc.nextLine();
		if(user.equals(username) && pass.equals(password))
		{
			System.out.println("Welcome "+username);
		}
		else
		{
			System.out.println("you have left with "+--count+" chances.");
			
		}
		}
		if(count==0)
		{
			System.out.println("Contact Admin");
		}

	}

}
