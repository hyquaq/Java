public abstract class Student {
	private String sName;
	private double gpa;

	public Student() {
		this.sName = "";
		this.gpa = 0.0;
	}

	public Student(String sName, double gpa) {
		this.sName = sName;
		this.gpa = gpa;
	}

	public String getsName() {
		return this.sName;
	}

	public double getGpa() {
		return this.gpa;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public abstract String getRank();

	@Override
	public String toString() {
		return this.sName + "-" + this.gpa;
	}
}