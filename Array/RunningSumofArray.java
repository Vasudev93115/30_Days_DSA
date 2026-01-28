package Array;

public class RunningSumofArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int sum=0;
        System.out.print("[");
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            System.out.print(sum+" ");
        }
        System.out.println("]");
    }
}
