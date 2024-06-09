package assignments;

import java.util.Scanner;

public class DigitCount {
    public int getTheNumberOfDigits(int n) {
        int c = 0;
        while(n!=0) {
            n=n/10;
            c=c+1;
        }
        return c;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new DigitCount().getTheNumberOfDigits(n));


    }
}
