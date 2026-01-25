package Strings;

public class shuffleString {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        char[] result = new char[s.length()];
        for(int i=0;i<result.length;i++){
            result[indices[i]] = s.charAt(i);

        }
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}
