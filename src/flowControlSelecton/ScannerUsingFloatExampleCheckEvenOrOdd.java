package flowControlSelecton;

import java.util.Scanner;
//Enter a number from keyboard and check that number is even or odd

public class ScannerUsingFloatExampleCheckEvenOrOdd {
	public static void main(String[] args) {
		//System.out.println("Enter a no : ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no : ");
		float a = s.nextFloat();
		if (a%2==0) {
			System.out.println("Even");
		}
		else if (a%2!=0) {
			System.out.println("Odd");
		}
	}

}
