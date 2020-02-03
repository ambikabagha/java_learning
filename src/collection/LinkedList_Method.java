package collection;

import java.util.LinkedList;

public class LinkedList_Method {
	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<String>();
		//adding string value
		link.add("Java");
		link.add("C#");
		link.add("Ruby");
		link.add("Python");
		link.add("Selenium");
		link.add("TestNG");
		link.add("Maven");
		System.out.println(link);
		
	    //add string value in specific index
		link.add(3, "Chrome");
		link.add(8, "FireFox");
		System.out.println(link);
		
		//Adding an element to the first position
		link.addFirst("chromeDriver.exe");
		System.out.println(link);
		
		 //Adding an element to the last position
	     link.addLast("GeckoDriver.exe");
	     System.out.println(link);
	     
	     //Removing First element
	     link.removeFirst();
	     System.out.println(link);

	     //Removing Last element
	     link.removeLast();
	     System.out.println(link);
	     
	     //removing 2nd element
	     link.remove(2);
	     System.out.println(link);
	     
	     //get the value from the given index
	     String five = link.get(5);
	     System.out.println(five);
	     
	     //get the index value of given element
	     Integer a = link.indexOf("Selenium");
	     System.out.println(a);
	     
	     System.out.println(link.size());
	     
	     System.out.println(link.isEmpty());
	   
	}

}
