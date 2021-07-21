package Assignment05;

import java.util.Arrays;
import java.util.List;

public class NewsCodes {

	public static void main(String[] args) {
		
		List<News> newsList=Arrays.asList(
				new News(101,"Rohit","sathya","It was really extraordinary"),
				new News(102,"Virat","sai","It has to be modified"),
				new News(103,"Dhoni","tinku","Awesome"),
				new News(104,"Rohit","suresh","can be improved"),
				new News(105,"Hardik","pandya","Good to see and learn Budget"));
		
	
		System.out.println("the 4th question");
		System.out.println("Find out the newsId which has received maximum comments.");
		
		News news1=newsList.stream()
				.max((o1,o2)->o1.getComment().length()-o2.getComment().length())
				.get();
		System.out.println(news1.getNewsId());
		
		
		System.out.println("the 5th question");
		System.out.println("Find out how many times the word 'budget' arrived in user comments all news.");
		
		newsList.stream()
		.filter(a->a.getComment().contains("Budget"))
		.forEach(o->System.out.println(o));
		
		
	
		
		

	}

}
