import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new ITStudent("Huy", 8.1, "01", 1));
		students.add(new MathStudent("Ha", 8, "02", "1"));
		students.add(new ITStudent("Hoa", 6.8, "03", 1));
		students.add(new MathStudent("Heo", 8.1, "04", "1"));
		students.add(new ITStudent("Hao", 9.2, "05", 1));
		students.add(new MathStudent("Hu", 10, "06", "1"));
		students.add(new ITStudent("Hy", 1.2, "07", 1));
		students.add(new MathStudent("Hi", 3.8, "08", "1"));
		students.add(new ITStudent("Hun", 6.7, "09", 1));
		students.add(new MathStudent("Hon", 9.9, "10", "1"));
		
//		System.out.println((ManagerStudent.findStudent(students)).size());
		for (Student s : ManagerStudent.findStudent(students)) {
			System.out.println(s);
		}
	}
}
