/* Question: Find Armstrong numbers in the range of A to B
 Input: A = 100, B = 500
 Output: [153, 370, 371, 407] */

package BasicMathAll;
import java.io.*;


public class ArmstromRange {
  public static boolean isArm( int num){
int n = num;
int cnt = 0;
while(n!=0){
cnt++;
n /= 10;
}
 n = num;
int sum =0;
while(n !=0){
int r = n%10;
sum += (int)Math.pow(r , cnt);
n /= 10;
}
if(sum==num) return true;
else return false;
  }
public static void  main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int A =  Integer.parseInt(br.readLine());
int B = Integer.parseInt(br.readLine());  
System.out.print("[");
        boolean first = true;
        for (int i = A; i < B; i++) {
            if (isArm(i)) {
                if (!first) System.out.print(", ");
                System.out.print(i);
                first = false;
            }
}
System.out.print("]");
}}

