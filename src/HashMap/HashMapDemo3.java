package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo3 {

	public static void main(String[] args) {
		//Synchronized Map
		Map<String,String> m = new HashMap<String,String>();
		
		Map<String,String> m1=Collections.synchronizedMap(m);
		System.out.println(m1);
        
		ConcurrentHashMap<String,String> chm = new ConcurrentHashMap<String,String>();
		chm.put("Abhi","rest");
	}

}
