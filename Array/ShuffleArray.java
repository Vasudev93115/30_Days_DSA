package Array;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int n=3;

        int[] ans = new int[2*n];
        int index=0;
        for(int i=0;i<n;i++){
            ans[index++]=arr[i];
            ans[index++]=arr[i+n];

        }
        for(int i=0;i<2*n;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
