package BasicMathAll;

/* Given an integer n, return the smallest prime palindrome greater than or equal to n.
An integer is prime if it has exactly two divisors: 1 and itself. Note that 1 is not a prime number.
For example, 2, 3, 5, 7, 11, and 13 are all primes.
An integer is a palindrome if it reads the same from left to right as it does from right to left.
For example, 101 and 12321 are palindromes.
The test cases are generated so that the answer always exists and is in the range [2, 2 * 108].

Example 1:
Input: n = 6
Output: 7

Example 2:
Input: n = 8
Output: 11

Example 3:
Input: n = 13
Output: 101 */
import java.util.*;
public class PrimePallindrome{
public static int primePalindrome(int n) {
        while (true) {
            // If palindrome and prime → return
            if (isPalindrome(n) && isPrime(n)) return n;
            n++;
            
        }
    }

    // Check if number is palindrome // another integer reverse method eo kra jabe
    public static boolean isPalindrome(int x) {
        int n = x; int rev = 0;
        while(x != 0){
            int r = x % 10;
            rev = rev*10 + r;
            x /= 10;
        }
        if(n != rev) return false;
        return true;
       /*  String s = Integer.toString(x);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;*/
    }

    // Check if number is prime
    public static boolean isPrime(int x) {
       if( x<= 1) return false;
       for(int i = 2; i <= Math.sqrt(x); i++ ){
         if(x % i == 0) return false;

       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(primePalindrome(n));
        sc.close();
    }
}