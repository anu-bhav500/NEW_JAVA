/* Problem Statement: Given an A.P. Series, we need to find the sum of the Series.

a = first term of A.P.

d= common Difference of A.P.

n= Number of Terms in  A.P.

Examples:

Example 1:
Input:
n=4
a=2
d=2
Output: 20
Explanation: 2+4+6+8 = 20

Input:
n=8
a=2
d=5
Output: 124
Explanation: -2 +3 + 8 + 13 + 18 + 23 + 28 + 33 = 124 */

import java.util.*;
public class ApSeries {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int sum = n * (2 * a + (n - 1) * d) / 2;

        System.out.println("Sum of the A.P. series: " + sum);

        sc.close();
    }
}


