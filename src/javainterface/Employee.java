package javainterface;

public class Employee implements IEmployee {
	public void getName() {
		System.out.println("I am Ambi");
	}

	public void test() {
		System.out.println("Hello");
	}

	public void print() {
		System.out.println("Wel come");
	}

	public static void main(String[] args) {
		IEmployee e = new Employee();
		e.getName();
		e.test();
	    //e.print();
	}

}
