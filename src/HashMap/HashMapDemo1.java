package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("India","New Delhi");
        hm.put("America","Washingtom DC");
        hm.put("UK","London");
        hm.put(null,"lebnon");
        hm.put(null,"Kuwait");
        hm.put("china",null);
        hm.put("Norht Koria",null);
         System.out.println(hm.get("India"));
         System.out.println(hm.get(null));
          Iterator<String> it=hm.keySet().iterator();
          while(it.hasNext())
          {
        	  String key=it.next();
        	  String value=hm.get(key);
        	  System.out.println("Key : "+key+"|"+"Value : "+value);
          }
          System.out.println("---------------");
          
          Iterator<Entry<String,String>> en=hm.entrySet().iterator();
          while(en.hasNext())
          {
        	  Entry<String,String> entry=en.next();
        	  System.out.println("Key : "+entry.getKey()+"Value : "+entry.getValue());
          }

	}

}
