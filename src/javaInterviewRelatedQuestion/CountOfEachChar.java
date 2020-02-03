package javaInterviewRelatedQuestion;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachChar {
	public static void main(String[] args) {
		String str="Ambika Bagha";
		char[] ch=str.toCharArray();
		Map<Character, Integer> strmap=new HashMap<Character, Integer>();
		for (char c : ch) {
			if (strmap.containsKey(c)) {
				int val=strmap.get(c);
				val++;
				strmap.put(c, val);
			}
			else {
				strmap.put(c, 1);
			}
		}
		System.out.println(strmap);
	}

}
