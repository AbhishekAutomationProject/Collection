package CollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("javaScript");
		al.add("Ruby");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Dev ops");
		al1.add("Testing");
		//Add All method 
//		al.addAll(al1);
//		System.out.println(al);
//		al.addAll(2,al1);
//		System.out.println(al);
//		al.clear();
//		System.out.print(al);
		
		//Clone Method
		ArrayList<String> cloneList=(ArrayList<String>)al.clone();
		System.out.println(cloneList);
		
		//contains Method
		System.out.println(al.contains("Ruby"));
		System.out.println(al.contains("c"));
		
		//IndexOf Method
		System.out.println(al.indexOf("Ruby")>0);
		
		//LastIndexof
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Naveen","Praveen","Tom","Steve","Lisa","Naveen"));
		System.out.println(list);
		int i=list.lastIndexOf("Naveen");
		System.out.println(i);
		
		//Remove Method
		list.remove(1);
		System.out.println(list);
		
		list.remove("Lisa");
		System.out.println(list);
		
		//RemoveIf
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		list1.removeIf(num -> num%2==0);
		System.out.println(list1);
		
		//RetainAll
		ArrayList<String> namelist = new ArrayList<String>(Arrays.asList("Naveen","Praveen","Tom","Steve","Lisa","Naveen"));
		System.out.println(namelist);
		
		namelist.retainAll(Collections.singleton("Naveen"));
		System.out.println(namelist);
		
		//SubList
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		
		ArrayList<Integer> subList = new ArrayList<Integer>(list2.subList(2,6));
		System.out.println(subList);
	
		ArrayList<String> namelist1 = new ArrayList<String>(Arrays.asList("Naveen","Praveen","Tom","Steve","Lisa","Naveen"));
		
		Object arr[]= namelist1.toArray();
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		

	}

}
