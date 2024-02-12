package CollectionConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] a= {1,2,3,1,4,2};
		int len=a.length;	
		Arrays.sort(a);
		int result=a[len-2];
		System.out.println(result);
		
		List<Integer> lst=Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println(lst.toString());
		int result1=lst.get(lst.size()-2);
		System.out.println(result1);	
	}
}
