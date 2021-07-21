package Assignment03;
import java.util.*;
public class HashMap04 {

	public static void main(String[] args) {
		HashMap<HashDate04,String> hash=new HashMap<>();
		HashDate04 d1=new HashDate04(01,02,1999);
		HashDate04 d2=new HashDate04(10,12,2005);
		HashDate04 d3=new HashDate04(07,10,1998);
		HashDate04 d4=new HashDate04(05,04,2000);
		hash.put(d1,"KP");
		hash.put(d2,"BP");
		hash.put(d3,"CP");
		hash.put(d4,"DP");
		Set<Map.Entry<HashDate04,String>> entry=hash.entrySet();
		Iterator<Map.Entry<HashDate04,String>> it=entry.iterator();
		while(it.hasNext())
		{
			Map.Entry<HashDate04,String> ent=(Map.Entry<HashDate04, String>) it.next();
			HashDate04 d=ent.getKey();
			String a=ent.getValue();
			
			System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
			System.out.println(a);
			
			
		}

	}

}
