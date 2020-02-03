package array;

public class GreatestNo {
	public static void main(String[] args) {
		int a[]= {1,2,10,8,4,3,5};
		int max=0;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>max) {
				
				max=a[i];
				
			}
			
		}
		System.out.println(max);
	}

}
