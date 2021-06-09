package firstapp;

public class Employee {

	public Employee() {
		
		this(10);
		System.out.println("no-arg");
	}
	public Employee(int i) {
		this(10.5);
		System.out.println("int-arg");
	}
	public Employee(double d) {
		//this(10.5);
		System.out.println("double-arg");
	}
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee(10);
	Employee e3=new Employee(10.5);
	}
}
