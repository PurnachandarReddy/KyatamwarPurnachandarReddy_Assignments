package Assignment03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class CopyOnWriteList08 {
		public static void main(String args[])
		{
			CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.add(50);
			System.out.println(list);
			
			Iterator<Integer> itr=list.iterator();  
			while(itr.hasNext()){  
			list.remove(1);
			System.out.println(itr.next()); 
			}

		}
}
