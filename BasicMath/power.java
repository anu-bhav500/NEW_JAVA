package BasicMath;
import java.util.Scanner;

public class power {
  public static void powerx(int n, int x ){
    int ans =1;
    while(x>0){
      if(x%2!=0){
        ans *= n;
         x -= 1;

      }
      else{
        n *= n;
        x /= 2;
      }
    }
    System.out.println(ans);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int x = sc.nextInt();
    powerx(num,x);
    sc.close();
  }
}
