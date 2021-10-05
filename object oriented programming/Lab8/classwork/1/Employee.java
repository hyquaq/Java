public class Employee extends Person {
	private String id;
	private double salary;

	public Employee() {
		super();
		this.id = "";
		this.salary = 0.0;
	}

	public Employee(String name, String birthDay, String id, double salary) {
		super(name, birthDay);
		this.id = id;
		this.salary = salary;
	}

	public String getId() {
		return this.id;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "-" + this.id + "-" + this.salary;
	}
}