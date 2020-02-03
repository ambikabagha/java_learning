package javaInterviewRelatedQuestion;

import java.io.ObjectInputStream.GetField;

public class PrimeNumber {
	public static boolean isPrimeNumber(int num) {
		if (num<=1) {
			return false;
		}
		for (int i=2; i < num; i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getNumber(int num1) {
		for (int i = 2; i <=num1; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		boolean a=isPrimeNumber(17);
		System.out.println(a);
		getNumber(100);
	}

}
