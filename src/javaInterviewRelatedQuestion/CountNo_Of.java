package javaInterviewRelatedQuestion;

public class CountNo_Of {
	public static void main(String[] args) {
		String s="susant1234!@@@@#$%^456khAtRI*(&%?  ri";
		char[] ch=s.toCharArray();
		int num=0;
		int uc=0;
		int lc=0;
		int spclch=0;
		for (char c : ch) {
			if (c>=48 && c<=57) {
				num++;
			}
			else if (c>=65 && c<=90) {
				uc++;
			}
			else if (c>=97 && c<=122) {
				lc++;
			}
			else {
				spclch++;
			}
		}
		System.out.println(num);
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(spclch);
	}

}
