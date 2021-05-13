import java.util.*;

public class Dictionary {

	static HashMap<String, String> dictions = new HashMap<String, String>();

	public static boolean isExists(String word) {
		if (dictions.get(word) == null) {
			return false;
		}

		return true;
	}

	public static String getMeaning(String word) {
		if (isExists(word)) {
			return dictions.get(word);
		}

		return "None";
	}

	public static void main(String[] args) {
		dictions.put("frog", "con ech");
		dictions.put("spider", "con nhen");
		dictions.put("crow", "con qua");
		dictions.put("falcon", "chim ung");
		dictions.put("bull", "con bo tot");
		dictions.put("owl", "con cu");
		dictions.put("parrot", "con vet");
		dictions.put("crab", "con cua");
		dictions.put("bat", "con doi");

		// System.out.println(dictions.get("the"));
		// System.out.println(isExists("chicken"));
		// System.out.println(isExists("owl"));

		System.out.print("enter word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(getMeaning(word));
	}
}
