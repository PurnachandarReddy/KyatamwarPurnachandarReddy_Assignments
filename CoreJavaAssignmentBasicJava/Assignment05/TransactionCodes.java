package Assignment05;

import java.util.Arrays;
import java.util.List;

public class TransactionCodes {
	public static void main(String args[])
	{
		List<Transaction> transactionList=Arrays.asList(
				(new Transaction(new Trader("Rohit","Hyderbad"),2011,2000)),
				(new Transaction(new Trader("Virat","Delhi"),2020,200)),
				(new Transaction(new Trader("Dhoni","Bangalore"),2011,20)),
				(new Transaction(new Trader("Suresh","Pune"),2018,2)),
				(new Transaction(new Trader("Hardik","Mumbai"),2017,20000)));
		
		System.out.println("the 10th question");
		System.out.println("Find  all  transactions  in  the  year  2011  and  sort  them  by  value  (small  to high)");
		
		transactionList.stream()
		.filter(a->a.getYear()==2011)
		.sorted((a1,a2)->a1.getValue()-a2.getValue())
		.forEach(o->System.out.println(o.getValue()));
		
		
		System.out.println("the 13th question");
		System.out.println("Print all transactions’ values from the traders living in Delhi.");
		
		transactionList.stream()
		.filter(a->a.getTrader().getCity().equalsIgnoreCase("delhi"))
		.forEach(a->System.out.println(a.getValue()));
		
		System.out.println("the 14th question");
		System.out.println("What’s the highest value of all the transactions?");
		
		Transaction highest = transactionList.stream()
			.max((a1,a2)->a1.getValue()-a2.getValue())
			.get();
			 System.out.println(highest.getValue());
			 
		System.out.println("the 15th question");
		System.out.println("Find the transaction with the smallest value."); 
		
		Transaction smallest = transactionList.stream()
				.min((a1,a2)->a1.getValue()-a2.getValue())
				.get();
				 System.out.println(smallest.getValue());
		

		
	}

}
