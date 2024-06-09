public class LinearProbing {

    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        //Your code here
        int[] hashtable = new int[hash_size];
        for(int i = 0;i < hash_size; i++) {
            hashtable[i] = -1;
        }
        for(int i=0;i<sizeOfArray;i++) {
            boolean f = true;
            int pos = (arr[i]+1)%hash_size;
            while(pos != -1) {
                pos = (pos+1)%hash_size;
                if(pos == ((arr[i]+1)%hash_size)) {
                    f = false;
                    break;
                }
            }
            if(f) {
                hashtable[pos] = arr[i];
            }
        }
        return hashtable;
    }

    public static void main(String...args) {
        int hash_size = 10;
        int[] arr =  {4,14,24,44};
        int sizeOfArray = 4;
        int[] hashtable = new LinearProbing().linearProbing(hash_size, arr, sizeOfArray);

    }
}
