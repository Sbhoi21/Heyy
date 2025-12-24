package mindmap2.array4.hasing;

public class Q5UniqueMorseCodeWords {


    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        int result = uniqueMorseRepresentations(words); // Output: 2
        System.out.println("Number of unique Morse code representations: " + result);

    }


    static int uniqueMorseRepresentations(String[] words) {

        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        java.util.HashSet<String> uniqueTransformations = new java.util.HashSet<>();

        for (String word : words) {
            StringBuilder morseWord = new StringBuilder();
            for (char ch : word.toCharArray()) {
                morseWord.append(morseCodes[ch - 'a']);
            }
            uniqueTransformations.add(morseWord.toString());
        }

        return uniqueTransformations.size();
    }


}
