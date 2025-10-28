/* Write a program to perform the following:
 Take two positive integers m and n as input.
 Find the m-th prime number and the n-th prime number.
 For each of these two prime numbers, calculate the sum of its digits
 repeatedly until the result is a single-digit number (i.e., less than 10).
 Let these results be m1 and n1.
 Finally, print the value of m * m1.
 TestCases:
 m=5   n=6
 Output
 10
 Explaination
 5th prime = 11 → digit sum = 1 + 1 = 2 → m1 = 2
 6th prime = 13 → digit sum = 1 + 3 = 4 → n1 = 4
 Final answer → m * m1 = 5 * 2 = 10 */
package TCStoktofive;
import java.util.Scanner;

public class PrimeDigitSum {
  public static boolean isprime(int num){
    if(num <2) return false;
    for(int i = 2;i<= Math.sqrt(num) ;i++){
      if(num %i == 0){
        return false;
      }
    }
      return true;
    

  }


  public static int nthprime(int n){
    int count = 0; int num =1;
    while(count < n){
     num ++;
     if(isprime(num)){
      count++;
     }
    }
     return num;
    
  }
  public static int digitsum(int num){
    while(num >= 10){
      int sum = 0;
      while(num > 0){
        int rem = num %10;
        sum += rem;
        num /= 10;
      }
      num = sum;
    }
    return num;
  }
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int m = sc.nextInt();
  int n = sc.nextInt();
  int primex = nthprime(m);
  int primey = nthprime(n);
  int m1 = digitsum(primex);
  int n1 = digitsum(primey);
  System.out.println(m*m1);
   System.out.println(n*n1);
  sc.close();

}
}
