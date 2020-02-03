package javaInterviewRelatedQuestion;

public class ReverseStringAndCheckPalendrome {
	public static void main(String[] args) {
		String str="A B A";
		String str1="";
		char[] ch=str.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			str1=str+i;
		}
		System.out.println(str1);
		if (str.equals(str1)) {
			System.out.println("palendrome");
		}
		else {
			System.out.println("not a palendrome");
		}
	}

}
