package breakExampls;

public class SecondEvenNo {
	public static void main(String[] args) {
		int a[]= {9,5,3,4,6,8};
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				cnt=cnt+1;
			}
			if (cnt==2) {
				System.out.println(a[i]);
				break;
			}
		}
	}

}
