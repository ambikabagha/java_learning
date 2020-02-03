
package methodExamples;

import java.util.Scanner;

public class Example1 {
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	int mul(int a,int b) {
		int c=a*b;
		return c;
	}
	int div(int a,int b) {
		int c=a/b;
		return c;
	}
	int reminder(int a,int b) {
		int c=a%b;
		return c;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int x=s.nextInt();
		System.out.println("Enter 2nd number");
		int y=s.nextInt();
		Example1 e=new Example1();
		int ad=e.add(x,y);
		System.out.println(ad);
		int su=e.sub(x, y);
		System.out.println(su);
		int mu=e.mul(x, y);
		System.out.println(mu);
		int di=e.div(x, y);
		System.out.println(di);
		int re=e.reminder(x, y);
		System.out.println(re);
		
	}

}
