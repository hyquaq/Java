public class String1 {
	public static String shortName(String str) {
		String[] words = str.split(" ");
		return words[words.length-1] + " " + words[0];
	}
	
	public static String hashtagName(String str) {
		String[] words = str.split(" ");
		return "#" + words[words.length-1] + words[0];
	}
	
	public static String upperCaseAllVowel(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'u' ||
				str.charAt(i) == 'e' ||
				str.charAt(i) == 'o' ||
				str.charAt(i) == 'a' ||
				str.charAt(i) == 'i') {
					result += Character.toUpperCase(str.charAt(i));
				} else {
					result += str.charAt(i);
				}
		}
		return result;
	}	
	
	public static String upperCaseAllN(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'n') {
					result += Character.toUpperCase(str.charAt(i));
				} else {
					result += str.charAt(i);
				}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String name = "Nguyen Tran Quang Huy";
		System.out.println(shortName(name));
		System.out.println(hashtagName(name));
		System.out.println(upperCaseAllN(name));
		System.out.println(upperCaseAllVowel(name));
	}
}

