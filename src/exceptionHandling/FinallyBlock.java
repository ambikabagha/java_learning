package exceptionHandling;

public class FinallyBlock {
	public static void main(String[] args) {
	    int a= 10;
	    int b=0;
	    int c=0;
	  
		try {
	      c=a/b;
		} catch (Exception e) {
			System.out.println("catch Block");
			e.printStackTrace();
		}
		  
		finally {
			
			System.out.println("finally block");
			System.out.println("The division of"+" "+a+" "+"and"+" "+b+" "+"is"+" "+c);
			System.out.println("Method End");
		}
	}

}
