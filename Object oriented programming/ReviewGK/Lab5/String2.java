public class String2 {
	public static int countWord(String paragraph) {
		String[] words = paragraph.split(" ");
		return words.length;
	}
	
	public static int countSentences(String paragraph) {
		String[] words = paragraph.split(".");
		for (String sentence : words) {
			System.out.println(sentence);
		}
		return words.length;
	}
	
	public static int countAppear(String paragraph, String word) {
		String[] words = paragraph.split(" ");
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			// System.out.println(words[i]);
			if (words[i].equals(word)) {
				count++;
			}
		}
		return count;
	}	
	
	public static void main(String[] args) {
		String name = "Nguyen Tran Quang Huy. hi";
		System.out.println(countWord(name));
		System.out.println(countSentences(name));
		System.out.println(countAppear(name, "Huy"));
	}
}
