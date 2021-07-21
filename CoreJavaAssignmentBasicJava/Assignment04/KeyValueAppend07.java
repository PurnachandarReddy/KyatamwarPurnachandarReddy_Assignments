package Assignment04;

import java.util.Map;
import java.util.TreeMap;

public class KeyValueAppend07 {

	public static void main(String[] args) {
		Map<String,String> map=new TreeMap();
		map.put("common","man");
		map.put("Second","person");
		map.put("exceptional","handling");
		map.put("thread","safe");
		
		StringBuilder stringbuilder=new StringBuilder();
		map.entrySet().forEach(s->stringbuilder.append(s.getKey()).append(s.getValue()).append(", "));
		
		System.out.println(stringbuilder.toString());
	}

}
