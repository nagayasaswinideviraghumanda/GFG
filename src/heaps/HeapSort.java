package heaps;

public class HeapSort {
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i = (n-2)/2; i>=0;i--) {
            heapify(arr,n,i);
        }
    }

    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        int l = 2*i+1, r = 2*i+2;
        int largest = i;
        if(l<n && arr[l]>arr[largest]) {
            largest = l;
        }
        if(r<n && arr[r]>arr[largest]) {
            largest = r;
        }
        if(largest != i) {
            swap(arr,largest,i);
            heapify(arr,n,largest);

        }
    }

    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);
        for(int i = n-1; i >= 1; i--) {
            swap(arr,0,i);
            heapify(arr,i,0);
        }

    }

    void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String...args) {
        int[] arr = {10 ,9, 8 ,7 ,6 ,5, 4, 3, 2, 1};
        new HeapSort().heapSort(arr,arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
