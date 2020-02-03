package breakExampls;

public class FirstEvenNo {
	public static void main(String[] args) {
		int a[]= {9,5,3,4,6,8};
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
				break;
			}
			
		}
	}

}
