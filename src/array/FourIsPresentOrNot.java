package array;

public class FourIsPresentOrNot {
	public static void main(String[] args) {
		int a[] = { 1, 2, 10, 8, 4, 3, 5 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 4) {
				System.out.println("Present");
			}
		}
	}

}
