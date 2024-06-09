import java.util.HashMap;

public class LeftMostRepeatingCharacter {
    //Function to find repeated character whose first appearance is leftmost.
    static int repeatedCharacter(String S)
    {
        // add your code here
        HashMap<Character,Integer> f = new HashMap<>();
        int lIndex = Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++) {
            if(f.containsKey(S.charAt(i))) {
                if(f.get(S.charAt(i))<lIndex){
                    lIndex = f.get(S.charAt(i));
                }
            } else {
                f.put(S.charAt(i),i);
            }
        }
        if(lIndex == Integer.MAX_VALUE) {
            lIndex = -1;
        }
        return lIndex;

    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int r = LeftMostRepeatingCharacter.repeatedCharacter(s);
        System.out.println(r);
    }
}
