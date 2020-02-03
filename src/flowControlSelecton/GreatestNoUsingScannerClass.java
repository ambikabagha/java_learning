package flowControlSelecton;

import java.util.Scanner;
//Enter three numbers from keyboard and check which one is greatest.

public class GreatestNoUsingScannerClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = s.nextInt();
		System.out.println("Enter b : ");
		int b = s.nextInt();
		System.out.println("Enter c : ");
		int c = s.nextInt();
	    if (a>b && a>c) {
		System.out.println("a is greater");	
		}
	    else if (b>a && b>c) {
			System.out.println("b is greater");
		}
	    else {
			System.out.println("c is greater");
		}
	}

}
