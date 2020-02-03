package polymorphism;

public class MethodOverloading {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Sum of " + a + " and " + b + " = " + c);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Sum of " + a + " , " + b + " and " + c + " = " + d);
	}

	
	/*
	 * public int add(int d, int e) { return d + e; }
	 */

	public void add(int a, float b) {
		float c = a + b;
		System.out.println("Sum of " + a + " and " + b + " = " + c);
	}

	public void add(float a, float b) {
		float c = a + b;
		System.out.println("Sum of " + a + " and " + b + " = " + c);
	}

	public void add(float a, int b) {
		float c = a + b;
		System.out.println("Sum of " + a + " and " + b + " = " + c);
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add(3, 4);
		m.add(3, 4, 5);
		m.add(3, 4.5f);
		m.add(3.4f, 5);
		m.add(3.4f, 3.4f);
	}

}
