package methodExamples;
//take 2 parameters integer array and integer number and check 0the number is present or not. if yes then print true or false
public class Ex5 {
	boolean numberAvailable(int a[],int b) {
		boolean c=false;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==b) {
				c=true;
				break;
			}
			
		}
		return c;
		
	}
	public static void main(String[] args) {
		int ab[]= {2,3,4,8,9};
		Ex5 e=new Ex5();
		boolean result=e.numberAvailable(ab,5);
		System.out.println(result);
	}

}
