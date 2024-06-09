public class ReArrange {

    public static void rearrange(long arr[], int n){
        long max = arr[n-1]+1;

        for(int i=0;i<n;i++) {
            arr[i] *= (max);
        }
        int maxIndex = n-1;
        int minIndex = 0;
        for(int i=0;i<n;i++) {
            if(i%2 == 0) {
                arr[i] += (arr[maxIndex]/(max));
                maxIndex--;
            } else {
                arr[i] += (arr[minIndex]/(max));
                minIndex++;
            }
        }
        for(int i=0;i<n;i++) {
            arr[i] = arr[i]%max;
        }
    }

    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        rearrange(arr, n);
        for(long i:arr) {
            System.out.print(i+" ");
        }
    }
}
