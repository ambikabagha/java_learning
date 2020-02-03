package whileLoop;

//Check whether 5 is present or not in the array and print the number if present
public class Ex3 {
	public static void main(String[] args) {
		int a[]= {3,4,5,10,12,13,5};
		int i=0;
		while (i<a.length) {
			if (a[i]==5) {
				System.out.println(a[i]);
			}
			i++;
		}
	}

}
