package javaInterviewRelatedQuestion;

public class UpperCaseLtr2LowerCaseViseVersa {
	public static void main(String[] args) {
		String str="AmbikaBagha";
		String s="";
		char[] ch=str.toCharArray();
		for (char c : ch) {
			if (c>=65 && c<=90) {
				char x=(char) (c+32);
				s=s+x;
			}
			if (c>=97 && c<=122) {
				char x=(char) (c-32);
				s=s+x;
			}
		}
		System.out.println(s);
	}

}
