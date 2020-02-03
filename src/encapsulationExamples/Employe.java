package encapsulationExamples;

public class Employe {
	public static void main(String[] args) {
		Employeee e=new Employeee();
		System.out.println(e.getName());
		e.setName("Ambika");
		System.out.println(e.getName());
		System.out.println(e.getAge());
		e.setAge(25);
		System.out.println(e.getAge());
		System.out.println(e.getId());
		e.setId(105);
		System.out.println(e.getId());
		System.out.println(e.getSalary());
		e.setSalary(20000.55);
		System.out.println(e.getSalary());
	}

}
