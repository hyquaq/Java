import java.util.*;

public class ManagerStudent {
	public static ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
		ArrayList<Student> result = new ArrayList<Student>();
		
		for (Student s : lstStu) {
			if (s instanceof ITStudent) {
				ITStudent tmp = (ITStudent) s;
				if (s.getRank().equals("A")) {
					result.add(s);
				}
			} else {
				MathStudent tmp = (MathStudent) s;
				if (s.getRank().equals("Passed")) {
					result.add(s);
				}
			}
			
		}
		
		return result;
	}
}