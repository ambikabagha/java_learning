package collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		List<Integer> arr1=new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(20);
		arr1.add(60);
		arr1.add(10);
		
		List<Integer> arr2=new ArrayList<Integer>();
		
		for (int i = 0; i < arr1.size(); i++) {
			
			if (!arr2.contains(arr1.get(i))) {
				arr2.add(arr1.get(i));
			}
			
		}
		System.out.println(arr2);
	}
	
}
