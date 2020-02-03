package collection;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_addindexMethod {
	public static void main(String[] args) {
		List<Integer> indexelement=new ArrayList<Integer>();
		indexelement.add(0, 5);
		indexelement.add(1, 25);
		indexelement.add(2, 15);
		indexelement.add(3, 27);
		indexelement.add(1, 2);
		indexelement.add(2, 76);
		indexelement.add(4, 56);
		
		System.out.println(indexelement);
		
	}


}
