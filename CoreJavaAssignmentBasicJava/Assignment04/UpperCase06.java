package Assignment04;

import java.util.ArrayList;
import java.util.List;

public class UpperCase06 {

	public static void main(String[] args) {
		
				List<String> list3=new ArrayList<>();
				list3.add("Purnachandar");
				list3.add("Kyatamwar");
				list3.add("Reddy");
				list3.add("KPCReddy");
				
				list3.replaceAll(i->i.toUpperCase());
				System.out.println(list3);


			}
}
