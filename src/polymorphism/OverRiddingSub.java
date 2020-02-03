package polymorphism;

public class OverRiddingSub extends OverRidding {
	public static void main(String[] args) {
		OverRiddingSub o = new OverRiddingSub();
		o.add(3, 4);
	}

	protected void add(int a, int b) {
		if (a > b) {
			System.out.println(a + b);
		} else {
			System.out.println(0);
		}
	}
}
