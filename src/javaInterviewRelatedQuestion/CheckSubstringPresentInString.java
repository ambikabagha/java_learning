package javaInterviewRelatedQuestion;

public class CheckSubstringPresentInString {
	
	static int isSubstring(String s1,String s2) {
		int M=s1.length();
		int N=s2.length();
		for (int i = 0; i < N-M; i++) {
			for (int j = 0; j < M; j++) {
				if (s2.charAt(i+j)!=s1.charAt(j)) {
					break;
					/*if (j==M) 
						return i;
					}*/

				}
			}
		}
		return N;
	}
	
	
	public static void main(String[] args) {
		
	}

}
