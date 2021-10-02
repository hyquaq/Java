public class String2 {
	public static int countWord(String paragraph) {
		String[] words = paragraph.split(" ");
		return words.length;
	}

	public static int countSentences(String paragraphs) {
		while (paragraphs.indexOf("..") != -1) {
			paragraphs = paragraphs.replace("..", ".");
		}

		int countSentences = 0;
		for (int i = 0; i < paragraphs.length(); i++) {
			if (paragraphs.charAt(i) == '.') {
				countSentences++;
			}
		}

		return countSentences;
	}

	public static int countAppear(String paragraphs, String word) {
		for (int i = 0; i < paragraphs.length(); i++) {
			if (!((paragraphs.charAt(i) >= 'a' && paragraphs.charAt(i) <= 'z')
					|| (paragraphs.charAt(i) >= 'A' && paragraphs.charAt(i) <= 'Z'))) {
				paragraphs = paragraphs.replace(paragraphs.charAt(i), ' ');
			}
		}

		System.out.print(paragraphs);
		String[] words = paragraphs.split(" ");
		int countWords = 0;
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			// System.out.println(words[i]);
			if (words[i].equals(word)) {
				countWords++;
			}
		}
		return countWords;
	}

	public static void main(String[] args) {
		String name = "Nguyen Tran \\Huy. ..Quang Huy... hi.";
		System.out.println(countWord(name));
		System.out.println(countSentences(name));
		System.out.println(countAppear(name, "Huy"));
	}
}
