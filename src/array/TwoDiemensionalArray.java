package array;

public class TwoDiemensionalArray {
	public static void main(String[] args) {
		int a[][]=new int[3][4];
		a[2][3]=4;//1st give row index no. and 2nd give column index no.
		a[0][2]=5;
		a[1][3]=10;
		a[2][5]=15;  //here it'll give exception bcoz there is correct row no and wrong column no
		System.out.println(a[2][3]);
		System.out.println(a[0][2]);
		System.out.println(a[1][3]);
		System.out.println(a[2][5]);
	}

}
