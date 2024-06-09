public class MinNoSortedRotatedArray {
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        int res = Integer.MAX_VALUE;
        while(low<=high) {
            int mid = (low+high)/2;
            res = Math.min(res, arr[mid]);
            if(arr[low]<=arr[mid]) {
                res = Math.min(arr[low], res);
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return res;
    }

    public static void main(String...args) {
        int[] arr = {4,5,6,7,8,9,1,2,3};
        int n = 9;
        System.out.println(minNumber(arr, 0, n-1));
    }
}
