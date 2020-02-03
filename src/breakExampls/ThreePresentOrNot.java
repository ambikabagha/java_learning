package breakExampls;

public class ThreePresentOrNot {
	public static void main(String[] args) {
		int a[]= {0,2,3,8,5,4};
		for (int i = 0; i < a.length; i++) {
			if (a[i]==3) {
				System.out.println(a[i]);
				break;
			}
		}
	}

}
