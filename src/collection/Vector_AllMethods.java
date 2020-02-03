package collection;

import java.util.Vector;

public class Vector_AllMethods {
	
	public static void main(String[] args) {
		Vector<Integer> vc= new Vector<Integer>();
		vc.add(10);
		vc.add(20);
		vc.add(30);
		vc.add(40);
		vc.add(50);
		vc.add(60);
		System.out.println(vc);
		
		vc.add(6, 70);
		vc.add(7, 80);
		vc.add(8, 90);
		System.out.println(vc);
		
		vc.addElement(100);
		vc.addElement(110);
		System.out.println(vc);
		
		//print all index number with element
		for(Integer eleFrmVc: vc){   
		 System.out.println("Index : " +vc.indexOf(eleFrmVc)+ " Value: " +eleFrmVc);

		  }
		
		int totalNoOfElement=vc.size();
		System.out.println(totalNoOfElement);
		
		System.out.println(vc.capacity());
	}

}
