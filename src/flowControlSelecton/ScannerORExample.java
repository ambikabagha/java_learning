package flowControlSelecton;

import java.util.Scanner;
//Enter two number from keyboard and check 

public class ScannerORExample {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a :");
		int a=s.nextInt();
		System.out.println("Enter b :");
		int b=s.nextInt();
		
		if (a>10 || b<10) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Hi");
		}
	}

}
