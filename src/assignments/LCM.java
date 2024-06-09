package assignments;

import java.util.Scanner;

public class LCM {
    public int getLCM(int a, int b) {
        if(b>a) {
            int t = b;
            b = a;
            a = t;
        }
        int temp = a;
        int i = 1;
        while((a % b) != 0) {
            i++;
            a = temp*i;
        }

        return a;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(new LCM().getLCM(a,b));
    }
}
