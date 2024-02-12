package CollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicated {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,8,7,8,3,4,1,1,2,2));
		
		LinkedHashSet<Integer> linkedListSet = new LinkedHashSet<Integer>(al);
		
		ArrayList<Integer> al1= new ArrayList<Integer>(linkedListSet);
		
		System.out.println(al1);
		
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,8,7,8,3,4,1,1,2,2));
		List<Integer> lt=marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(lt);
		
		

	}

}
