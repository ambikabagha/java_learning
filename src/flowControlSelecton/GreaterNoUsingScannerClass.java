package flowControlSelecton;

import java.util.Scanner;
//Enter two number from keyboard check which one is greater

public class GreaterNoUsingScannerClass {
    public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = s.nextInt();
		System.out.println("Enter b : ");
		int b = s.nextInt();
		if (a>b) {
			System.out.println("a is greater");
		}
		else if (b>a) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("Equal");
		}
		
	}
	

}
