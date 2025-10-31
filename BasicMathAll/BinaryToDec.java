package BasicMathAll;
/*  Question: Binary to Decimal Conversion
 Input: 1010
 Output: 10 */
import java.util.Scanner;

public class BinaryToDec {
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int bin = sc.nextInt();
sc.close();
int dec = 0; int pow = 0;
while(bin != 0){
int r = bin % 10;
dec += r*((int)Math.pow(2, pow)) ;
pow++;
bin /= 10; 
}
System.out.println(dec);
}


}
