package CollectionConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(100);
		a.add(200);
		a.add("Testing");
		a.add('t');
		a.add(true);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println("LI = "+0);
		System.out.println("HI = "+(a.size()-1));
		
		a.add(400);
		a.add(300);
		System.out.println(a.size());
		
		

	}

}
