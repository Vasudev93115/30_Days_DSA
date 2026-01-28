package Strings;

public class ReverseWordInString {
    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();

        reverse(arr, 0, arr.length - 1);

        int start = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }

        return new String(arr).trim();

    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s = " Hello World ";
        System.out.println(reverseWords(s)); // World Hello
    }
}
