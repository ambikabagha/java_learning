package exceptionHandling;

public class ThrowsTest {
	public static void main(String[] args) {
		ThrowsEx t= new ThrowsEx();
		int ret=0;
		try {
			ret=t.divide(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ret);
		System.out.println("End");
	}

}
