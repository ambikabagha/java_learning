package whileLoop;

//Check whether 5 is present or not in the array and print the number if present with the index number
public class Ex4 {
	public static void main(String[] args) {
		int a[]= {3,4,5,10,12,13,5};
		int i=0;
		while (i<a.length) {
			if (a[i]==5) {
System.out.println(a[i]+" "+"is present in index"+" "+i);//here a[i] will print the element in the index no and "i" will print only index no
			}
			i++;
		}
	}

}
