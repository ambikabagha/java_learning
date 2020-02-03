package encapsulationExamples;

public class Employeee {
	private String name;
	private int age;
	private int id;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name=s;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id=i;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d ) {
		salary=d;
	}

}
