package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapDemo2 {
	static HashMap<String,Integer> hm;
	
	static
	{
		hm=new HashMap<String,Integer>();
		hm.put("A",100);
	}

	public static void main(String[] args) {
		//1 way creating HashMap
		HashMap<String,Integer> hm1 =  new HashMap<String,Integer>();
		hm1.put("B",200);
		System.out.println(hm1.get("B"));
		
		//Static block
		System.out.println(HashMapDemo2.hm.get("A"));
		
		//singeltonMap
		Map<String,Integer> hm2=Collections.singletonMap("test",100);
		System.out.println(hm2.get("test"));
		
		//streamof method
		Map<String,String> hm3= Stream.of(new String[][]
				{
			          {"Naveen","A+grade"},
			          {"Praveen","A++grade"},
				  }).collect(Collectors.toMap(data->data[0],data->data[1]));
		System.out.println(hm3.get("Naveen"));
		
		//Mapof
		Map<String,String> hm4=Map.of("K1","V1","K2","V2","K3","V3");
		System.out.println(hm4.get("K3"));
				
	 
		
		
		
		

	}

}
