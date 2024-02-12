package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1.put(1,"A");
		hm1.put(2,"B");
		hm1.put(3,"C");
		
		HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
		hm2.put(2,"B");
		hm2.put(1,"A");
		hm2.put(3,"C");
		
		HashMap<Integer,String> hm3 = new HashMap<Integer,String>();
		hm3.put(1,"A");
		hm3.put(2,"B");
		hm3.put(3,"C");
		hm3.put(3,"D");
		
		//on the basis of key-value pair
		System.out.println(hm1.equals(hm2));
		System.out.println(hm1.equals(hm3));
		
		//on the basis of same key: KeySet method
		System.out.println(hm1.keySet().equals(hm2.keySet()));
		System.out.println(hm1.keySet().equals(hm3.keySet()));
		
		//find out the extra key
		HashMap<Integer,String> hm4 = new HashMap<Integer,String>();
		hm4.put(1,"A");
		hm4.put(2,"B");
		hm4.put(3,"C");
		hm4.put(4,"D");
		
		HashSet<Integer> hs = new HashSet<>(hm1.keySet());
		hs.addAll(hm4.keySet());
		hs.removeAll(hm1.keySet());
		System.out.println(hs);
		
		HashMap<Integer,String> hm5 = new HashMap<Integer,String>();
		hm5.put(1,"A");
		hm5.put(2,"B");
		hm5.put(3,"C");
		
		HashMap<Integer,String> hm6 = new HashMap<Integer,String>();
		hm6.put(4,"A");
		hm6.put(5,"B");
		hm6.put(6,"C");
		
		HashMap<Integer,String> hm7 = new HashMap<Integer,String>();
		hm7.put(1,"A");
		hm7.put(2,"B");
		hm7.put(3,"C");
		hm7.put(4,"C");
		
		//duplicate are not allowed
		System.out.println((new ArrayList(hm5.values()).equals(new ArrayList(hm6.values()))));
		System.out.println((new ArrayList(hm5.values()).equals(new ArrayList(hm7.values()))));
		
		//duplicates are allowed
		System.out.println(new HashSet<>(hm5.values()).equals(new HashSet<>(hm6.values())));
		System.out.println(new HashSet<>(hm5.values()).equals(new HashSet<>(hm7.values())));
		
		

	}

}
