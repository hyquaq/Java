public class Student extends Person {
	private String id;
	private double score;

	public Student() {
		super();
		this.id = "";
		this.score = 0.0;
	}

	public Student(String name, String birthDay, String id, double score) {
		super(name, birthDay);
		this.id = id;
		this.score = score;
	}

	public String getId() {
		return this.id;
	}

	public double getScore() {
		return this.score;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return super.toString() + "-" + this.id + "-" + this.score;
	}
}