import java.util.*;
public class array {
  // Array sum 
  public static int array_sum(int[] b){
    int ans = 0;
    for(int a : b){
      ans += a;
    }
    return ans;
  }
  public static void main(String[] args) {
    // Basic declaration and Initialization
    int arr[];
    arr = new int[4];
    int[] b = new int[3];
    int[] c = {10,20,30};
    System.out.println(arr.length);
    System.out.println(c.length);

    // input from user
    Scanner sc = new Scanner(System.in);
    for(int i =0; i<b.length; i++){
      b[i] = sc.nextInt();
    }
    System.out.println("printing");
    for(int a : b){
      System.out.println(a);
    }
    int ans = array_sum(b);
    System.out.println(ans);
    sc.close();
  }
}
