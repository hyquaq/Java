import java.util.ArrayList;
public class PersonModel <T> {
	private ArrayList<T> al = new ArrayList<T>();
	public void add(T obj) {
		al.add(obj);
	}
	
	public void display() {
		for (T obj : al) {
			System.out.println(obj);
		}
	}
	
	public static void main(String[] args) {
		// code here
		PersonModel<Person> objectStudent = new PersonModel<Person>();
		
		// use the add method to enter 2 student
		Student s1 = new Student("Hy", "2002", "52", 10);
		Student s2 = new Student("Huy", "2002", "53", 9);
		objectStudent.add(s1);
		objectStudent.add(s2);
		
		
		// use the display method to display information of 2 student have entered
		objectStudent.display();
		
		
		PersonModel<Person> objectEmployee = new PersonModel<Person>();
		
		// use the add method to enter 2 employee
		Employee e1 = new Employee("Hy", "2002", "25", 50000);
		Employee e2 = new Employee("Huy", "2002", "15", 10000);
		objectEmployee.add(e1);
		objectEmployee.add(e2);
		
		
		// use the display method to display information of 2 employee have entered
		objectEmployee.display();
		
		PersonModel<Person> objectPerson = new PersonModel<Person>();
		
		// use the add method to enter 2 person
		Person p1 = new Person("Hy", "2002");
		Person p2 = new Person("Huy", "2002");
		objectPerson.add(p1);
		objectPerson.add(p2);
		
		
		// use the display method to display information of 2 person have entered
		objectPerson.display();
	}
}
