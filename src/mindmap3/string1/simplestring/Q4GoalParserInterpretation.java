package mindmap3.string1.simplestring;

public class Q4GoalParserInterpretation {

    // LC 1678. Goal Parser Interpretation
    public static void main(String[] args) {

        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            char c = command.charAt(i);
            if (c == 'G') {
                result.append('G');
                i++;
            } else if (c == '(') {
                if (i + 1 < command.length() && command.charAt(i + 1) == ')') {
                    result.append('o');
                    i += 2;
                } else {
                    result.append("al");
                    i += 4;
                }
            }
        }
        return result.toString();
    }

}
