public class ITStudent extends Student {
	private String sID;
	private int type;

	public ITStudent() {
		super();
		this.sID = "";
		this.type = 0;
	}

	public ITStudent(String sName, double gpa, String sID, int type) {
		super(sName, gpa);
		this.sID = sID;
		this.type = type;
	}

	public String getsID() {
		return this.sID;
	}

	public int getType() {
		return this.type;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String getRank() {
		if (this.getGpa() <= 5) {
			return "C";
		} else if (this.getGpa() <= 8) {
			return "B";
		} else if (this.getGpa() <= 10) {
			return "A";
		}

		return "";
	}

	@Override
	public String toString() {
		return super.toString() + "-" + this.sID + "-" + this.type;
	}
}