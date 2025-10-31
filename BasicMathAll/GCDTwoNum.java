package BasicMathAll;
/* . Question: Greatest Common Divisor (GCD) of two numbers
 Input: A = 36, B = 60  
 output : 12 */

import java.util.Scanner;

public class GCDTwoNum {
  public static int gcd(int a , int b){
while(b != 0){
int temp = b;
b = a % b;
a = temp;
}
return a;
}
 public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
System.out.println(gcd(num1,num2));
sc.close();
}
}
