package exceptionHandling;

public class ExceptionHandling {
	public void divide(int a, int b) {
		int c=0;
		System.out.println("Mathod Start");
		try {
			 c=a/b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("The division of"+" "+a+" "+"and"+" "+b+" "+"is"+" "+c);
		System.out.println("Method End");
	}

}
