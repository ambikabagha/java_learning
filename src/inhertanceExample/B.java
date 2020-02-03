package inhertanceExample;

public class B extends A {
	public void print() {
		System.out.println("Love Yourself");
	}
	public static void main(String[] args) {
		B obj=new B();
		obj.test();
		obj.print();
		A obj1=new B();
		obj1.test();
		//obj1.print();
		//B obj2=new A();
		A obj3=new A();
		obj3.test();
		//obj3.print();
	}

}
