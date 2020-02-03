package flowControlSelecton;

import java.util.Scanner;

public class SwitchcaseExample2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a : ");
		String a=s.next();
		switch (a) {
		case "Ambi":
			System.out.println("Ambi");
			break;
		case "Minu":	
			System.out.println("Minu");
			break;
		case "Chinu":	
			System.out.println("Chinu");
			break;
		case "Debi":
			System.out.println("Debi");
			break;
		
		
		}
	}

}
