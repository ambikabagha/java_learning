package array;

public class MissingNoInArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6,7,8,9,10};
		//totalNoOfElement=9,expectedNoOfElements=10;
		int expectedNoOfElement=a.length+1;//10
		int totalSum=expectedNoOfElement*(expectedNoOfElement+1)/2;
		int sum=0;
		for (int i = 0; i < a.length; i++) { //toFindOutSumOfPresentedElement
			sum=sum+a[i];
		}
		
		System.out.println("The missing no is"+" "+(totalSum-sum));
	}

}
