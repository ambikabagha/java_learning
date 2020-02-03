package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ContainsMethod {
	public static void main(String[] args) {
		List<Integer> no = new ArrayList<Integer>();
		no.add(10);
		no.add(20);
		no.add(40);
		no.add(70);
		no.add(100);
		
		Boolean a =no.contains(40);
		Boolean b =no.contains(70);
		Boolean c =no.contains(130);
		Boolean d =no.contains(402);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
