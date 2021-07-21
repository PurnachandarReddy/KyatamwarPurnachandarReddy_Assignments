package Assignment05;

import java.util.Arrays;
import java.util.List;

public class FruitCodes {
	public static void main(String args[])
	{
		List<Fruit> fruitList=Arrays.asList(
				new Fruit("mango",50,200,"orange"),
				new Fruit("apple",200,300,"red"),
				new Fruit("banana",20,700,"yellow"),
				new Fruit("grapes",80,80,"green"),
				new Fruit("custard apple",60,90,"green"));
		
		System.out.println("the first question in fruits");
		System.out.println("Display  the  fruit  names  of  low  caloriesfruits  i.e.  calories  <  100  sorted  in descending order of calories.");
		
		fruitList.stream()
		.filter(a->a.getCalories()<100)
		.sorted((a1,a2)->a2.getCalories()-a1.getCalories())
		.forEach(a->System.out.println(a.getName()));
		
		System.out.println("the second question in fruits");
		System.out.println("Display colorwise list of fruit names.");
		
		fruitList.stream()
		.sorted((a1,a2)->a1.getColour().compareTo(a2.getColour()))
		.forEach(a->System.out.println(a.getName()+"\t"+a.getColour()));
		
		System.out.println("the second question in fruits");
		System.out.println("Display only RED color fruits sorted as per their price in ascending order.");
		
		fruitList.stream()
		.filter(a->a.getColour().equalsIgnoreCase("red"))
		.sorted((a1,a2)->a1.getPrice()-a2.getPrice())
		.forEach(System.out::println);
		
	}

}
