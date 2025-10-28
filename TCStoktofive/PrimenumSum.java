package TCStoktofive;
/*  Sum of All Prime Numbers Between 2 and n
 Given an integer n, return the sum of all prime numbers between 2 and n (inclusive).
 Constraints:
 Input:
 A single integer n representing the upper limit.
 Output:
 Return an integer representing the sum of all prime numbers between 2 and n.
 Example 1:
 Input: 10
 Output: 17
 Explanation: The prime numbers between 2 and 10 are [2, 3, 5, 7]. Their sum is 2 + 3 + 5 + 7 = 17.
 Example 2:
 Input: 2
 Output: 2
 Explanation: 2 is the only prime number between 2 and 2 */

import java.util.Scanner;

public class PrimenumSum {
  public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static int sumOfPrimes(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(sumOfPrimes(n));
        sc.close();
 }
 
}
