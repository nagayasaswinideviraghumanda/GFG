package stacks;

import java.util.ArrayDeque;

public class EvaluatePostFix {
    public static int evaluatePostFix(String S)
    {
        // Your code here
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<S.length();i++) {
            if(S.charAt(i)>='0' && S.charAt(i)<='9') {
                st.push(Character.getNumericValue(S.charAt(i)));
            } else {
                int val2 = st.pop();
                int val1 = st.pop();
                switch(S.charAt(i)) {
                    case '+' : st.push( val1+val2);
                        break;
                    case '-' : st.push( val1-val2);
                        break;
                    case '*' : st.push( val1*val2);
                        break;
                    case '/' : st.push( val1/val2);
                        break;
                }

            }
        }
        return st.pop();
    }

    public static void main(String...args) {
        System.out.println(evaluatePostFix("231*+9-"));
    }

}
