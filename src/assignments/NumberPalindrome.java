package assignments;

import java.util.Scanner;

public class NumberPalindrome {
    public boolean isAPalindromeNumber(int n) {
        int reverseNumber = 0;
        int number = n;
        while(n>0) {
            reverseNumber = reverseNumber*10+(n%10);
            n=n/10;
        }
        return number==reverseNumber;
    }
    //The time complexity of this program is O(d) where d is is the digits of the input number . Space complexity and auxiliary space are O(1)
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new NumberPalindrome().isAPalindromeNumber(n));
    }
}
