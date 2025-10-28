package TCStoktofive;
/*  Write a program that accepts two integer inputs, X and Y, which
 denote specific positions in the sequence of prime numbers. The
 program should identify the prime numbers at these positions,
 compute their product, subtract 1 from the result, and display the
 final output.
 TestCases:
 3 5
 Output
 54
 Explaination
 3rd prime number → 5
 5 prime number → 11 th
 Output → (5*11)-1= 54 */

import java.util.*;
public class PrimeNumArithmetic{

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

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int x = sc.nextInt();
  int y = sc.nextInt();
  int primex = nthprime(x);
  int primey = nthprime(y);
  System.out.println(primex);
  int result = (primex * primey) -1;
  System.out.println(result);
  sc.close();
}
}