public class SmallestPositiveMissingNumber {

    static int missingNumber(int arr[], int n)
    {
        // Your code here

        boolean isOnePresent = false;
        for(int i=0;i<n;i++) {
            if(arr[i]==1) {
                isOnePresent = true;
            }
            if(arr[i]<1 || arr[i]>n) {
                arr[i]=1;
            }
        }
        if(!isOnePresent) {
            return 1;
        }

        for(int i=0;i<n;i++) {
            arr[arr[i]%n - 1]+=n;
        }

        for(int i=0;i<n;i++) {
            if(arr[i]<n) {
                return i+1;
            }
        }
        return n+1;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(missingNumber(arr, n));
    }


}
