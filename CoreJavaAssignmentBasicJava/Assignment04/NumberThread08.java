package Assignment04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NumberThread08 {

	public static void main(String[] args) {
		List<Integer> list4=new ArrayList<>();
		list4.add(10);
		list4.add(20);
		list4.add(30);
		list4.add(40);
		
		Thread t1=new Thread(new Runnable()
				{
			@Override
			public void run()
			{
				Consumer<Integer> cons=i->list4.add(i);
				cons.accept(50);
				System.out.println(list4);
				
				
			}
				});
		t1.run();
		
		

	}

}
