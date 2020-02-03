package methodExamples;
//enter parameter as int a,int b.hold (a+b)square in c and (a-b)square in d. return c and d in one method.call in main method and print  the result

public class Ex3 {
	int[] squareNo(int a,int b) {   //in one method we can't keep 2 return type so here we're using array concept
		int c=(a*a)+(2*a*b)+(b*b);
		int d=(a*a)-(2*a*b)+(b*b);
		int arr[]=new int[2];
		arr[0]=c;
		arr[1]=d;
		return arr;
	
	}
	public static void main(String[] args) {
		Ex3 obj=new Ex3();
		int[] abc=obj.squareNo(3,4);
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		
	}

}
