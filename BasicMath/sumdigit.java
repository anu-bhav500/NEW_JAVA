package BasicMath;
import java.util.*;
public class sumdigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum =0;
    while(num !=0){
      int r = num %10;
      sum += r;
      num /= 10;
    }
    System.out.println(sum);
    sc.close();
  }
}
