package CollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Abhishek");
		ar.add("Abhi");
		ar.add("shek");
		ar.add("Abhik");
		
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("------");
		
		for(String s:ar)
		{
			System.out.println(s);
		}
		
		System.out.println("------");
		
		Iterator<String> it=ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(ar1);
		

	}

}
