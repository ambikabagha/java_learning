package flowControlSelecton;

import java.util.Scanner;
//Enter a number from keyboard and check that number is less than or greater than 10.
//If a>10 then print "a is greater than 10" or a<10 then print "a is less than 10"

public class EnterNoFrmKeyboardUsingScannerClass {
	public static void main(String[] args) {
		System.out.println("Enter a no : ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a > 10) {
			System.out.println("a is greater thaty 10");
		} else if (a < 10) {
			System.out.println("a is less than 10");
		}
	}

}
