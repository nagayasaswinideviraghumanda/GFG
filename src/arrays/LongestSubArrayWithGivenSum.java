import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    static int findLongestConseqSubseq(int[] arr, int n, int sum)
    {
        int maxLength = 0;
        HashMap<Integer,Integer> k = new HashMap<>();
        int currSum = 0;
        for(int i=0;i<n;i++) {
            currSum += arr[i];
            if(currSum == sum) {
                maxLength = Math.max(maxLength,i+1);
            }
            if(!k.containsKey(currSum)) {
                k.put(currSum,i);
            }
            if(k.containsKey(currSum-sum)) {
                maxLength = Math.max(maxLength,i-k.get(currSum-sum));
            }
        }
        return maxLength;
    }

    public  static void main(String...args) {
        int[] arr = {5,8,-4,-4,9,-2,2};
        int n = 7;
        int sum = 0;
        System.out.println(LongestSubArrayWithGivenSum.findLongestConseqSubseq(arr, n, sum));

    }
}
