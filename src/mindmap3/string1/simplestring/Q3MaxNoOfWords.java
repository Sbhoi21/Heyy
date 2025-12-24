package mindmap3.string1.simplestring;

public class Q3MaxNoOfWords {


    // LC 2114. Maximum Number of Words Found in Sentences
    public static void main(String[] args) {

        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            maxWords = Math.max(maxWords, words.length);
        }
        return maxWords;
    }



    public static int mostWordsFound2(String[] sentences) {
        int maxWords = 0;
        int count = 0;
        for (String t : sentences) {
            count = wordcount(t);
            maxWords = Math.max(maxWords, count);
        }
        return maxWords;
    }

    public static int wordcount(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {

            if (c == ' ') {
                count++;
            }
        }
        return count + 1;
    }


}
