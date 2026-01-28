package Array;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5}};

        int maxSum =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum +arr[i][j];
            }
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}

