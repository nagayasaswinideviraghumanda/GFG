public class MaxIndex {
    static int maxIndexDiff(int arr[], int n) {

        // Your code here
        int minIndex = 0;
        int maxIndex = 1;
        int res = arr[maxIndex]-arr[minIndex];
        for(int i=1;i<n;i++) {
            if(res<=(arr[i]-arr[minIndex])) {
                maxIndex = i;
                res = arr[i]-arr[minIndex];
            }
            if(arr[i]<arr[minIndex]) {
                minIndex = i;
            }

        }
        return (maxIndex-minIndex);

    }

    public static void main(String...args) {
        int[] arr = {34,8,10,3,2,80,30,33,1};
        int n = 9;
        System.out.println(maxIndexDiff(arr, n));
    }
}
