package StringAll;
/* For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB" 
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: "" */
import java.util.*;

public class GcdString {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void gcdString(String str1, String str2) {
        // Convert to uppercase just for safety (optional if guaranteed uppercase)
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        // Check if they can form a valid common divisor string
        if (!((str1 + str2).equals(str2 + str1))) {
            System.out.print("");
            return;  // stop execution if no common pattern
        }

        int gcdLen = gcd(str1.length(), str2.length());
        System.out.print(str1.substring(0, gcdLen));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();

        gcdString(str1, str2);
    }
}


    
    

  