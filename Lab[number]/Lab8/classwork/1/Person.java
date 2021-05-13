public class Person {
	private String name, birthDay;
	
	public Person() {
		this.name = "";
		this.birthDay = "2020";
	}
	
	public Person(String name, String birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getBirthDay() {
		return this.birthDay;
	}
	
	@Override
	public String toString() {
		return this.name + "-" + this.birthDay;
	}
}