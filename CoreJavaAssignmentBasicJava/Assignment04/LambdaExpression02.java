package Assignment04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression02 {
	public static void main(String args[])
	{
		List<Collection02> list=Arrays.asList(
				new Collection02("KP",15000,"ACCEPTED"),
				new Collection02("JP",5000,"ACCEPTED"),
				new Collection02("DP",50000,"COMPLETED"),
				new Collection02("SP",1000,"ACCEPTED")
				);
		
		list.stream()
		.filter(i->i.getPrice()>10000 && (i.getStatus().equalsIgnoreCase("ACCEPTED") || i.getStatus().equalsIgnoreCase("COMPLETED")))
		.forEach(System.out::println);
	}

}
