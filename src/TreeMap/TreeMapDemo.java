package TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> t1 = new TreeMap<Integer,String>();
		t1.put(1000,"Abhi");
		t1.put(1200,"bhi");
		t1.put(2000,"kitn");
		t1.put(3000,"piont");
		t1.put(4000,"joint");
		t1.put(10000,"hint");
		
		Iterator it=t1.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println("Key is "+me.getKey()+" Value is "+me.getValue());
			
		}
		t1.forEach((k,v)->System.out.println("Key is "+k+" Value is "+v));
		
		System.out.println("first Key is "+t1.firstKey());
		System.out.println("Lasr key is "+t1.lastKey());
    
		Set<Integer> s1 = t1.headMap(3000).keySet();
		System.out.println(s1);
		
		Set<Integer> s2 = t1.tailMap(3000).keySet();
		System.out.println(s2);
		
	
		
		
		

		
	}

}
