package javaInterviewRelatedQuestion;

public class AscendingOrder {
	
	public static void main(String[] args) {
		int a[]= {4,6,2,0,56,24,45,78};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int k=a[i];
					a[i]=a[j];
					a[j]=k;
				}
			}
			
		}
		for(int x:a) {
			System.out.print(x+" ");
		}
		
	}

}
