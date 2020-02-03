package continueExample;

public class Example1 {
	public static void main(String[] args) {
		int a[]= {9,1,6,7,8};
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				continue;
			}
			System.out.println(a[i]);
		}
	}

}
