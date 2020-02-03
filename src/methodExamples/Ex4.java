package methodExamples;
// write a method whose parameter is integer array.add all the numbers in that array and print total sum

public class Ex4 {
	int add(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {5,6,7,8};
		Ex4 e=new Ex4();
		int ad=e.add(arr);
		System.out.println(ad);
	}

}
