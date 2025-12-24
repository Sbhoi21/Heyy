package mindmap2.array1.simplearray;

public class Q5DecodeXoredArray {

    public static void main(String[] args) {
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] decoded = decode(encoded, first);
        for (int num : decoded) {
            System.out.print(num + " ");
        }
    }

    public static int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] decoded = new int[n];
        decoded[0] = first;

        for (int i = 1; i < n; i++) {
            decoded[i] = decoded[i - 1] ^ encoded[i - 1];
        }

        return decoded;
    }

}
