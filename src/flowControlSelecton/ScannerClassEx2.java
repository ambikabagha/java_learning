package flowControlSelecton;

import java.util.Scanner;

public class ScannerClassEx2 {
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a no : ");
			int a = s.nextInt();
			System.out.println("Enter a no : ");
			int b = s.nextInt();
			if (a > b) {
				System.out.println("a is greater than b");
			} else if (a < b) {
				System.out.println("a is less than b");
			}
	}

}
