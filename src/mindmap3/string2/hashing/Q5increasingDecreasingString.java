package mindmap3.string2.hashing;

public class Q5increasingDecreasingString {

    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        System.out.println(sortString(s)); // Output: "abccbaabccba"
    }

    public static String sortString(String s) {
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        boolean ascending = true;

        while (result.length() < s.length()) {
            if (ascending) {
                for (int i = 0; i < 26; i++) {
                    if (charCount[i] > 0) {
                        result.append((char) (i + 'a'));
                        charCount[i]--;
                    }
                }
            } else {
                for (int i = 25; i >= 0; i--) {
                    if (charCount[i] > 0) {
                        result.append((char) (i + 'a'));
                        charCount[i]--;
                    }
                }
            }
            ascending = !ascending;
        }

        return result.toString();
    }

    public static String sortString1(String s) {
        int []fq = new int[26];
        for(char c : s.toCharArray()){
            fq[c-'a']++;
        }
        StringBuilder result = new StringBuilder();

        while(result.length() < s.length()){
            for(int i=0; i<26;i++){
                if(fq[i]>0){
                    result.append((char)(i+'a'));
                    fq[i]--;
                }
            }
            for(int i= 25; i>=0; i--){
                if(fq[i]>0){
                    result.append((char)(i +'a'));
                    fq[i]--;
                }
            }
        }

        return result.toString();
    }


}
