package BasicMath;
import java.util.Scanner;

public class pallinedrome {
  
  public static boolean isPalim(int n){
   int num = n;
   int rev =0;
   while(num != 0){
    int rem = num % 10;
    rev = rev*10 + rem;
    num /= 10;}
    if (rev == n){
      return true;

    }
    else return false;

   }
  ;
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(isPalim(num)){System.out.println("yes it is pallindrome");
   }
   else{
    System.out.println("It is not pallindrome");
   }
    sc.close();
}
}
