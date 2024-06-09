import assignments.Divisors;

import java.util.Scanner;

class MaxOccuringCharacter
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] f = new int[26];
        int maxCount = 0;
        int index = -1;
        for(int i=0;i<line.length();i++) {
            f[line.charAt(i)-'a']++;
            System.out.println("character "+line.charAt(i)+" frequency "+f[line.charAt(i)-'a']+" maxCount is "+maxCount+" at index "+index);
            if( f[line.charAt(i)-'a'] >= maxCount) {
                if(f[line.charAt(i)-'a'] == maxCount && line.charAt(i)-'a'<index) {
                    index = line.charAt(i)-'a';
                    System.out.println("frequencies are equal so picking the least index element");
                } else if(f[line.charAt(i)-'a'] > maxCount) {
                    maxCount = f[line.charAt(i)-'a'];
                    index = line.charAt(i)-'a';
                }
            }

        }
        return (char) (index + 'a');
    }
    public static void main(String...args) {
        System.out.println(MaxOccuringCharacter.getMaxOccuringChar("abcdefabcdef"));

    }

}