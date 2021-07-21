package Assignment04;

import java.util.ArrayList;
import java.util.List;

public class OddLength04 {

	public static void main(String[] args) {
		List<String> list2=new ArrayList<>();
		list2.add("Purnachandar");
		list2.add("Kyatamwar");
		list2.add("Reddy");
		list2.add("KPCReddy");
		
		list2.removeIf(i->i.length()%2!=0);
		System.out.println(list2);


	}

}
