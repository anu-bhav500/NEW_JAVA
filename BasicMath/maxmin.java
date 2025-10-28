package BasicMath;
import java.util.*;

public class maxmin {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int maxi = Integer.MIN_VALUE;
    int min =  Integer.MAX_VALUE;
    while(num !=0){
      int r = num % 10;
      maxi = Math.max(maxi , r);
      min = Math.min(min , r);
      num /= 10;
    
    }
    System.out.println(maxi+" "+min);
    sc.close();
  }
}
