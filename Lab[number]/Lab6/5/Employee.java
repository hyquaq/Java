public class Employee {
	private String ID, fullName;
	private int yearJoined;
	private double coefficientsSalary;
	private int numDaysOff;
	private final double basicSalary = 1150;

	public Employee() {
		this.ID = "0";
		this.fullName = "";
		this.yearJoined = 2020;
		this.coefficientsSalary = 1.0;
		this.numDaysOff = 0;
	}

	public Employee(String ID, String fullName, double coefficientsSalary) {
		this.ID = ID;
		this.fullName = fullName;
		this.coefficientsSalary = coefficientsSalary;
		// no parameters
		this.yearJoined = 2020;
		this.numDaysOff = 0;
	}

	public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
		this.ID = ID;
		this.fullName = fullName;
		this.yearJoined = yearJoined;
		this.coefficientsSalary = coefficientsSalary;
		this.numDaysOff = numDaysOff;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getID() {
		return ID;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setYearJoined(int yearJoined) {
		this.yearJoined = yearJoined;
	}

	public int getYearJoined() {
		return yearJoined;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setNumDaysOff(int numDaysOff) {
		this.numDaysOff = numDaysOff;
	}

	public int getNumDaysOff() {
		return numDaysOff;
	}

	public double getSenioritySalary() {
		return ((2020 - yearJoined) * this.coefficientsSalary) / 100;
	}

	public String considerEmulation() {
		if (this.numDaysOff <= 1) {
			return "A";
		}
		if (this.numDaysOff <= 3) {
			return "B";
		}
		return "C";
	}

	public double getSalary() {
		String level = this.considerEmulation();
		double emulationCoefficient = 0.5;
		if (level == "A") {
			emulationCoefficient = 1.0;
		}
		if (level == "B") {
			emulationCoefficient = 0.75;
		}

		return this.basicSalary * this.getCoefficientsSalary() * emulationCoefficient
				+ this.getSenioritySalary() * this.basicSalary;
	}

	@Override
	public String toString() {
		return this.fullName + " (Id = " + this.ID + ", Salary = " + this.getSalary() + ", Coefficients Salary = "
				+ this.getCoefficientsSalary() + ", Day off = " + this.getNumDaysOff() + ", Emulation = "
				+ this.considerEmulation() + ", Seniority Salary = " + this.getSenioritySalary() * this.basicSalary
				+ ")";
	}
}