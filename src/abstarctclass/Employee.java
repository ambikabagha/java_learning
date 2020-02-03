package abstarctclass;

public class Employee extends IlEmployee {
	public void test() {
		System.out.println("Hi");
	}

	public void get() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.test();
		e.print();
		e.get();
	}
}
