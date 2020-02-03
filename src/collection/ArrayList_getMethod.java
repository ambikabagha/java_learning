package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_getMethod {
	public static void main(String[] args) {
		List<String> getValueInindex=new ArrayList<String>();
		
		getValueInindex.add("Somanath");
		getValueInindex.add("Jyospina");
		getValueInindex.add("Suvarna");
		getValueInindex.add("Ambika");
		getValueInindex.add("Menaka");
		getValueInindex.add("Bhratashree");
		
		String a=getValueInindex.get(0);
		String b=getValueInindex.get(1);
		String c=getValueInindex.get(2);
		String d=getValueInindex.get(3);
		String e=getValueInindex.get(4);
		String f=getValueInindex.get(5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		  int sizeOfArrayList=getValueInindex.size();
		  
		  //Displaying elements of the list
		  for (int i = 0; i < sizeOfArrayList; i++) { 
			  System.out.println(getValueInindex.get(i));
		  }
		//Displaying elements of the list
		for (String stringName : getValueInindex) {
			System.out.println(stringName);
		}
	}

}
