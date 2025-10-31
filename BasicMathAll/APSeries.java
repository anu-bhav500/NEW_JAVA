package BasicMathAll;
import java.util.Scanner;

public class APSeries {
  public static void print_Ap(int a, int d, int n){
    System.out.print(a+ " ");
    for(int i = 2; i<= n ; i++){
      a +=d;
      System.out.print(a+ " ");
    }
  }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    print_Ap(5, 2, num);
    sc.close();
}
}
