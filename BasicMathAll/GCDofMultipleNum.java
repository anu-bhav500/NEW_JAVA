package BasicMathAll;
import java.util.*;
public class GCDofMultipleNum {
  public static int gcd(int a , int b){
while(b != 0){
int temp = b;
b = a % b;
a = temp;
}
return a;
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] s = str.trim().split(" ");
    int[] nums = new int[s.length];
    for(int i = 0; i< s.length ;i++){
      nums[i] = Integer.parseInt(s[i]);
    }
    sc.close();
    int result = nums[0];
    for(int i = 1; i< nums.length; i++){
      result = gcd(result, nums[i]);

    }
    System.out.print(result);

  }
}
