package BasicMathAll;
// import java.util.*;
import java.io.*;
public class armstrong {
  
  public static boolean isArmstrong(int num){
    int n = num;
    // find total number of digits
    int cnt = 0;
    while(n!=0){
      cnt ++;
      n /= 10;
    }

  /* Another way to find number of digits 

     int cnt = String.valueOf(num).length();  */
     
    int sum = 0;
     n = num;
     // find sum after cnt pow
     while(n != 0){
      int rem = n % 10;
      sum += Math.pow(rem , cnt);
      n /= 10; 
     }
     if(num == sum){
      return true;
     }
     else {
      return false;
     }
  
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    if(isArmstrong(num)){
      System.out.println("IT IS AN ARMSTRONG NUMBER");
    }
    else {
      System.out.println("IT IS NOT AN ARMSTRONG NUMBER");
    }
  }
}
