package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapDemo4 {

	public static void main(String[] args) {
	  
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Abhi",100);
		hm.put("Akashu",200);
		hm.put("Kanti",300);
		hm.put("Kavi",400);
		hm.put("Ravi",500);
		
		Iterator it =hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println("Key : "+me.getKey()+"  Value  :"+me.getValue());
		}
		
		List<String> lt= new ArrayList<String>(hm.keySet());
		for(String t:lt)
		{
			System.out.println(t);
		}
		List<Integer> lt1= new ArrayList<Integer>(hm.values());
		for(int i:lt1)
		{
			System.out.println(i);
		}

	}

}
