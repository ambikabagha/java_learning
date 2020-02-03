package javaInterviewRelatedQuestion;

import java.util.ArrayList;
import java.util.List;

public class StringStoreInArrayList {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		String s="Ambika Bagha";
		String news="";
		char[] ch=s.toCharArray();
		for (char c : ch) {
			if (c!=' ') {
				news=news+c;
			}
			else {
				list.add(news);
				news="";
			}
		}
		list.add(news);
		System.out.println(list);
		
	}

}
