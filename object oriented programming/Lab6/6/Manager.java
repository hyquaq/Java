public class Manager extends Employee {
	private String position;
	private String department;
	private double salaryCoefficientByPosition;

	public Manager() {
		super();
		this.position = "head of office";
		this.department = "administrative office";
		this.salaryCoefficientByPosition = 5.0;
	}

	public Manager(String ID, String fullName, double coefficientsSalary, String position,
			double salaryCoefficientByPosition) {
		super(ID, fullName, coefficientsSalary);
		this.position = position;
		this.salaryCoefficientByPosition = salaryCoefficientByPosition;
	}

	public Manager(String ID, String fullName, double coefficientsSalary, int yearJoined, int numDaysOff,
			String position, double salaryCoefficientByPosition) {
		super(ID, fullName, coefficientsSalary, yearJoined, numDaysOff);
		this.position = position;
		this.salaryCoefficientByPosition = salaryCoefficientByPosition;
	}

	@Override
	public String considerEmulation() {
		return "A";
	}

	public double bonusByPosition() {
		return super.getBasicSalary() * this.salaryCoefficientByPosition;
	}

	@Override
	public double getSalary() {
		double emulationCoefficient = 1.0;

		return super.getBasicSalary() * this.getCoefficientsSalary() * emulationCoefficient
				+ this.getSenioritySalary() * super.getBasicSalary() + this.bonusByPosition();
	}

	@Override
	public String toString() {
		return super.toString() + " (Position = " + this.position + ", Bonus = " + this.bonusByPosition() + ")";
	}
}