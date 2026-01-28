package Strings;

public class GoalParserInterpretation {
    public static String interpret(String command) {
        int n = command.length();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            if(command.charAt(i)=='G'){
                result.append('G');
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                result.append('o');
                i++;
            }else{
                result.append("al");
                i=i+3;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String command="G()()()()(al)";
        System.out.println(interpret(command));
    }
}
