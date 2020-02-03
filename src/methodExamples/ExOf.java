package methodExamples;

public class ExOf {
	int squareNo(int a,int b) {
		int c=(a*a)+(2*a*b)+(b*b);
		return c;
		
	}
	public static void main(String[] args) {
		ExOf obj=new ExOf();
		int result=obj.squareNo(4, 3);
		System.out.println(result);
		
	}

}
