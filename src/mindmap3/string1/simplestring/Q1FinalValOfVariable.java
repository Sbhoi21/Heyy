package mindmap3.string1.simplestring;

public class Q1FinalValOfVariable {


    // LC 2011. Final Value of Variable After Performing Operations
    public static void main(String[] args) {

        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                x++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                x--;
            }
        }
        return x;
    }

    public static int finalValueAfterOperations1(String[] operations) {
        int x = 0;
        for (String o : operations) x += (44 - o.charAt(1));
        return x;
    }

}
