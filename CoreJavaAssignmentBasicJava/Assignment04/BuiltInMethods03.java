package Assignment04;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInMethods03 {

	public static void main(String[] args) {
		
		List<Collection02> list1=Arrays.asList(
				new Collection02("KP",15000,"ACCEPTED"),
				new Collection02("JP",5000,"ACCEPTED"),
				new Collection02("DP",50000,"COMPLETED"),
				new Collection02("SP",1000,"ACCEPTED")
				);
		printConditionally(list1,p->p.getStatus().startsWith("A"),p->System.out.println(p));
		

	}
	public static void printConditionally(List<Collection02> list1, Predicate<Collection02> predicate, Consumer<Collection02> consumer)
	{
		for(Collection02 c: list1)
		{
			if(predicate.test(c))
			{
				consumer.accept(c);
			
			}
		}
	}

}
