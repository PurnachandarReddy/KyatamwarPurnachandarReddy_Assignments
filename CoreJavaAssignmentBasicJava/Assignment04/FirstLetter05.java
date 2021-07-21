package Assignment04;

import java.util.Arrays;

public class FirstLetter05 {
	public static void main(String args[])
	{
		StringBuilder firstLetter=new StringBuilder();
		Arrays.asList("Purna","chnadar","reddy","kyatamwar").forEach(o->firstLetter.append(o.charAt(0)));
		System.out.println(firstLetter);
	}

}

