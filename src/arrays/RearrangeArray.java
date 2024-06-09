public class RearrangeArray {
    static void arrange(long arr[], int n)
    {
        // your code here

        for(int i=0;i<n;i++) {
            arr[i]*=(n+1);
        }

        for(int i=0;i<n;i++) {
            arr[i]+=(arr[(int) (arr[i]/(n+1))])/(n+1);
        }

        for(int i=0;i<n;i++) {
            arr[i]=(arr[i]%(n+1));
        }
    }

    public static void main(String[] args) {
        long[] arr = {4,0,2,1,3};
        int n = arr.length;
        arrange(arr, n);
        for(long i:arr) {
            System.out.print(i+" ");
        }
    }
}
