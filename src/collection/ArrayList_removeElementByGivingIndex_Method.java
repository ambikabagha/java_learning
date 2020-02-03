package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_removeElementByGivingIndex_Method {
	public static void main(String[] args) {
		List<Integer> no = new ArrayList<Integer>();
		//String ArrayList
		no.add(10);
		no.add(20);
		no.add(30);
		no.add(40);
		no.add(50);
		no.add(60);
		no.add(70);
		no.add(80);
		no.add(90);
		no.add(100);
	    
	       System.out.println("ArrayList before remove are");
	       for(Integer onlyNo: no){
	            System.out.println(onlyNo);
	       }
	       
	       //Removing 1st element
	       no.remove(0);
	       //Removing 3rd element from the remaining list
	       no.remove(2);
	       //Removing 4th element from the remaining list
	       no.remove(2);
	       System.out.println("ArrayList After 1st remove are");
	       for(Integer onlyNo: no){
	             System.out.println(onlyNo);
	       }
	       
	       System.out.println("ArrayList 2nd removal ");
	       Integer i=no.remove(4);
	       System.out.println(i);
	       
	       System.out.println("ArrayList After remove are");
	       for(Integer onlyNo: no){
	             System.out.println(onlyNo);
	       }
	}

}
