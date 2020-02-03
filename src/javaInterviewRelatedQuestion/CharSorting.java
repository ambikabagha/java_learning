package javaInterviewRelatedQuestion;

public class CharSorting {
	public static void main(String[] args) {
		char[] arr= {'a','m','b','i','k','a'};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {	
				if (arr[i]>arr[j]) {
					char k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}	
		}
		for (char c : arr) {
			System.out.print(c+" ");
			
		}
	}

}
