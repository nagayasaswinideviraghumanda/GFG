public class InsertionSort {
    void insert(int arr[], int i)
    {
        // Your code here
        for(int j = i-1;j>=0;j--) {
            if(arr[j]>arr[j+1]) {
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
            }
        }
    }
    //Function to sort the array using insertion sort algorithm.
    void insertionSort(int arr[], int n)
    {
        //code here
        for(int i = 1;i<n;i++) {
            insert(arr,i);
        }
    }
    public static void main(String...args) {
        int[] arr = {4,1,3,9,7};
        int n = 5;
        new InsertionSort().insertionSort(arr, n);
        for(int i = 0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
