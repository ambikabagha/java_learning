package methodExamples;
//parameter should be a integer number and check whether the number is even or odd.if it's even then print true or else print false
public class Example2 {
	boolean evenOrOdd(int a){
		boolean b=false;
		if (a%2==0) {
			b=true;
		}
		else {
			b=false;
		}
		return b;
	}
	public static void main(String[] args) {
		Example2 e=new Example2();
		boolean c=e.evenOrOdd(3);
		System.out.println(c);
	}

}
