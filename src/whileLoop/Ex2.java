package whileLoop;
//print all the elements of array from last

public class Ex2 {
	public static void main(String[] args) {
		int a[]= {3,4,5,1,2,10,7};
		int i=a.length-1;
		while (i>=0) {
			System.out.println(a[i]);
			i--;
		}
	}

}
