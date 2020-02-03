package javaInterviewRelatedQuestion;

public class SplitTheStringFRomUppercaseLetter {
	public static void main(String[] args) {
		String str="AmbikaBaghaZ";
		String str1="";
		char[] ch=str.toCharArray();
		str1=str1+ch[0];
		for (int i = 1; i < ch.length; i++) {
			if (ch[i]>=65 && ch[i]<=90) {
				str1=str1+" "+ch[i];
				
			}
			else {
				str1=str1+ch[i];
			}
			
		}
		System.out.println(str1);
		
	}

}
