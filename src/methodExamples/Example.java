package methodExamples;
//take one array parameter and find greatest no and smallest no 
public class Example {
	int[] number(int a[]) {
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if (min>a[i]) {
				min=a[i];
			}
			
		}
		int ab[]=new int[2];
		ab[0]=max;
		ab[1]=min;
		return ab;
		
	}
	public static void main(String[] args) {
		int arr[]= {2,4,1,8,12};
		Example e=new Example();
		int[] num=e.number(arr);
		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}

	}

}
