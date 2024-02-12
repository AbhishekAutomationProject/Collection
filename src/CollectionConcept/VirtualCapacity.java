package CollectionConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		System.out.println(ar.size());
		ar.add(200);
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());

	}

}
