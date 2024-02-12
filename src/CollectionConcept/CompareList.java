package CollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		Collections.sort(al);
		Collections.sort(al1);
		
		System.out.println(al.equals(al1));
		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		System.out.println(al1.equals(al2));
		Collections.sort(al2);
		System.out.println(al1.equals(al2));
		
		ArrayList<String> al3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> al4 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		al3.retainAll(al4);
		
		System.out.println(al3);
		
		ArrayList<String> al5 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> al6 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		al5.removeAll(al6);
		
		System.out.println(al5);
		
		
	}

}
