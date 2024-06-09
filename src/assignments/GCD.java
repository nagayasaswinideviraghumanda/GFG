package assignments;

import java.util.Scanner;

public class GCD {
    public int getGCD(int a, int b) {
        while(b!=0 && a != 0) {
            if(a>b)
                a %= b;
            else
                b %= a;
        }
        return a==0?b:a;


    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(new GCD().getGCD(a,b));
    }
}
