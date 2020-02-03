package javaInterviewRelatedQuestion;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {
		String names[]= {"java","c","ruby","c","javaScript","python","java"};
		Set<String> s=new HashSet<String>();
		for (String name : names) {
			if (s.add(name)==false) {
				System.out.println(name);
			}
		}
		
	}

}
