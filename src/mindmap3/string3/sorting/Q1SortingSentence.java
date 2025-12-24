package mindmap3.string3.sorting;

public class Q1SortingSentence {

	public static void main(String[] args) {

		String s = "is2 sentence4 This1 a3";
		System.out.println(solution2(s));
	}

	private static String solution(String s) {

		String[] array = s.split(" ");
		System.out.println(array[0] + "   " + array[1]);
		String[] result = new String[array.length];

		for (String word : array) {
			System.out.println(word);
			int i = Integer.parseInt(String.valueOf(word.charAt(word.length() - 1)));
			System.out.println(i);
			
			result[i - 1] = word.substring(0, word.length() - 1);
		}

		StringBuilder s1 = new StringBuilder();
		for (String word: result) {
			System.out.println(word);
			s1.append(word + " ");
		}
		return s1.toString();
	}

    private static String solution2(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            sortedWords[index] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", sortedWords);
    }

}
