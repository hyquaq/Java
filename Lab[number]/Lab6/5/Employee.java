package lab6.5;

public class Employee {
    private String id, fullName;
    private int yearJoined, numDaysOff;
    private double coefficientsSalary;

    public Employee() {
        this.id = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0f;
        this.numDaysOff = 0;
    }

    public Employee(String id, String fullName, double coefficientsSalary) {
        this.id = id;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = 2020;
        this.numDaysOff = 0;
    }

    public Employee(String id, String fullName, int yearJoined, double coefficientsSalary, in numDaysOff) {
        this.id = id;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    public double getSenioritySalary() {
        return ((2020 - this.yearJoined) * this.coefficientsSalary) / 100;
    }

    public String considerEmulation() {

    }
}
