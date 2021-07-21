package Assignment05;

import java.util.Arrays;
import java.util.List;

public class TraderCodes {
	public static void main(String args[])
	{
		List<Trader> traderList=Arrays.asList(
				new Trader("Rohit","Hyderbad"),
				new Trader("Virat","Pune"),
				new Trader("Dhoni","Adilabad"),
				new Trader("Suresh","Indore"),
				new Trader("Hardik","Mumbai"));
		
		
		System.out.println("the 9th question");
		System.out.println("What are all the unique cities where the traders work?");
		
		traderList.stream()
		.distinct()
		.forEach(a->System.out.println(a.getCity()));
		
		System.out.println("the 10th question");
		System.out.println("Find all traders from Puneand sort them by name?");
		
		traderList.stream()
		.filter(a->a.getCity().equalsIgnoreCase("pune"))
		.sorted((a1,a2)->a1.getName().compareTo(a2.getName()))
		.forEach(o->System.out.println(o.getName()));
		
		System.out.println("the 11th question");
		System.out.println("Return a string of all traders’ names sorted alphabetically.");
		
		traderList.stream()
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.forEach(o->System.out.println(o.getName()));
		
		
		System.out.println("the 12th question");
		System.out.println("Are any traders based in Indore?");
		
	    traderList.stream()
		.filter(a->a.getCity().equalsIgnoreCase("Indore"))
		.forEach(o->System.out.println(o.getName()));
			
		
		
	}

}
