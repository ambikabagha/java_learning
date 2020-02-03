package javaInterviewRelatedQuestion;

public class ReverseInteger {
	public long reverse(long num) {
		
		long rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		
		ReverseInteger a=new ReverseInteger();
		//long ab=a.reverse(1234);
		//System.out.println(ab);
		System.out.println(a.reverse(1234));
	}

}
