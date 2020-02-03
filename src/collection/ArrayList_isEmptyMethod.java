package collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ArrayList_isEmptyMethod {
	public static void main(String[] args) {
		List<Integer> emptyOrNot=new ArrayList<Integer>();
		
		 System.out.println("Is ArrayList Empty: "+emptyOrNot.isEmpty());

	      //Adding Integer elements
		    Boolean a=emptyOrNot.add(10);
		    Boolean b=emptyOrNot.add(20);
			emptyOrNot.add(30);
			emptyOrNot.add(40);
			emptyOrNot.add(70);
			emptyOrNot.add(80);
			System.out.println(a);
			System.out.println(b);

	      //Again checking for isEmpty
	      System.out.println("Is ArrayList Empty: "+emptyOrNot.isEmpty());

		/*
		 * //Displaying elements of the list for (Integer number: emptyOrNot) {
		 * System.out.println(number); }
		 */
	}
	
}
