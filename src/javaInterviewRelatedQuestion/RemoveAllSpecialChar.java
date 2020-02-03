package javaInterviewRelatedQuestion;

public class RemoveAllSpecialChar {
	public static void main(String[] args) {
		String s="ambi123@#%ka``z";
		 String new_s="";
		char[] ch=s.toCharArray();
		for (char c : ch) {
			if (c>=48 && c<=57) {
				new_s+=c;
			}
			else if (c>=65 && c<=90) {
				new_s+=c;
			}
			else if (c>=97 && c<=122) {
				new_s+=c;
			}
			
		}
	    System.out.println(new_s);
	    		
	}

}
