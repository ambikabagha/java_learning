package javaInterviewRelatedQuestion;
//How to reverse a string
public class ReverseStringEx1 {
	public static void main(String[] args) {
		//1st way to reverse a string
		String s="SELENIUM";
		int len=s.length();
		String rev="";
		for (int i = len-1; i >=0; i--) {
		rev=rev+s.charAt(i);	
		}
		System.out.println(rev);
		
		//2nd way to reverse a string.
		String S="Hello World";
		StringBuffer sb=new StringBuffer(S);
		StringBuffer result=sb.reverse();
		System.out.println(result);
		
	    //you can write like this directly
		System.out.println(new StringBuffer(String.valueOf(S)).reverse());
	}

}
