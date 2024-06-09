public class MaxCircularSubArraySum {
    static int circularSubarraySum(int arr[], int n) {

        // Your code here

        int sum = arr[0];
        for(int i=1;i<n;i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

        int currSum = arr[0];
        int minSum = currSum;
        for(int i=1;i<n;i++) {
            currSum = Math.min(currSum+arr[i], arr[i]);
            minSum = Math.min(currSum,minSum);
        }
        System.out.println(minSum);

        currSum = arr[0];
        int maxSum = currSum;
        for(int i=1;i<n;i++) {
            currSum = Math.max(currSum+arr[i], arr[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);

        return Math.max(sum-minSum,maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {-12,-14};
        int n = arr.length;
        System.out.println(circularSubarraySum(arr, n));
    }
}
