package exceptionHandling;

public class TestTryCatch {
	public static void main(String[] args) {
		
		try {
			System.out.println(4/0);	
		} catch (Exception e) {
			System.out.println("Hi");
			System.out.println("Hello");
		}
		
		try {
		System.out.println("123");	
		} catch (Exception e) {
			System.out.println("Hi"); 
			System.out.println("Hello");
		}
		
	}

}
