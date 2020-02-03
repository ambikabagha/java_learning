package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_removeElementByGivingElement_Method {
	public static void main(String args[]) {
	       //String ArrayList
	       List<String> nameInList = new ArrayList<String>();
	        nameInList.add("Somanath");
	        nameInList.add("Jyospina");
	        nameInList.add("Suvarna");
			nameInList.add("Ambika");
			nameInList.add("Menaka");
			nameInList.add("Bhratashree");
			
			 System.out.println("ArrayList before remove are");
		       for(String singleName: nameInList){
		           System.out.println(singleName);
		       }
		       //Removing element Ambika from the arraylist
		       nameInList.remove("Ambika");
		       //Removing element Suvarna from the arraylist
		       nameInList.remove("Suvarna");
		       //Removing element Menaka from the arraylist
		       nameInList.remove("Menaka");
		       
		       boolean b=nameInList.remove("Bhratashree");
		       System.out.println("Element Bhratashree removed: "+b);
		       
		       System.out.println("ArrayList After remove are");
		       for(String singleName: nameInList){
		           System.out.println(singleName);
		       } 
	}

}
