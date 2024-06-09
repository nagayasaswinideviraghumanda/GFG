public class PeakElement {
    public int peakElement(int[] arr,int n)
    {
        //add code here.
        int low = 0, high = n-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(((mid == 0)||(arr[mid-1]<arr[mid]))&&((mid == n-1)||(arr[mid+1]<arr[mid]))) {
                return arr[mid];
            } else if(arr[mid-1]>arr[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String...args) {
        int[] arr = {1,2,3};
        int n = 3;
        PeakElement peakElement = new PeakElement();
        System.out.println(peakElement.peakElement(arr, n));
    }
}
