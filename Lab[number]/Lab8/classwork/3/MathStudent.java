public class MathStudent extends Student {
	private String sID;
	private String type;

	public MathStudent() {
		super();
		this.sID = "";
		this.type = "0";
	}

	public MathStudent(String sName, double gpa, String sID, String type) {
		super(sName, gpa);
		this.sID = sID;
		this.type = type;
	}

	public String getsID() {
		return this.sID;
	}

	public String getType() {
		return this.type;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getRank() {
		if (this.getGpa() < 5) {
			return "Failed";
		} else {
			return "Passed";
		}
	}

	@Override
	public String toString() {
		return super.toString() + "-" + this.sID + "-" + this.type;
	}
}