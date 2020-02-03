package javaInterviewRelatedQuestion;

public class RemoveExtraSpace {
	public static void main(String[] args) {
		String s="ambika  bagha";
		String str="";
		char[] ch=s.toCharArray();
		int cnt=0;
		for (char c : ch) {
			if (c!=' ') {
				str=str+c;
			}
			if (c==' ') {
				
			}
		}
	}

}
