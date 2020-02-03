package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_indexOfMethod {
	public static void main(String[] args) {
		List<String> getValueInindex=new ArrayList<String>();
				
		getValueInindex.add("Somanath");
		getValueInindex.add("Jyospina");
		getValueInindex.add("Suvarna");
		getValueInindex.add(3,"Ambika");
		getValueInindex.add(4,"Menaka");
		getValueInindex.add(5,"Bhratashree");
		
		int a=getValueInindex.indexOf("Somanath");
		int b=getValueInindex.indexOf("Jyospina");
		int c=getValueInindex.indexOf("Suvarna");
		int d=getValueInindex.indexOf("Ambika");
		int e=getValueInindex.indexOf("Menaka");
		int f=getValueInindex.indexOf("Bhratashree");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
