package array;

public class First {
	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[1]=3;
		a[0]=1;
		a[3]=4;
		a[4]=5;
		
		System.out.println(a[3]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		a[1]=4;
		a[5]=6;
		System.out.println(a[10]);
		if (a[0]==a[4]) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
		if (a[2]>a[3]) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
		}

}
