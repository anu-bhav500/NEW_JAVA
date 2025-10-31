package BasicMathAll;
import java.util.Scanner;
// perfect num means the sum of all divisior(except itself) is equal to this number itself
public class PerfectNum {
  public static boolean isPerfect(int n){
// 1st find all divisors
int sum =1;
for(int i=2; i<= Math.sqrt(n);i++){
  // we start from i = 2 so number itself dont come 
if(n%i==0){
  sum += i;
  if(i!= n/i){
sum += n/i;
  }
}
}
// System.out.println(sum);
if(sum == n){
  return true;
}
else{
  return false;
}
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(isPerfect(num)){
      System.out.println("yes it is perfect");
    }
    else{
      System.out.println("no it is not perfect");
    }
    sc.close();

}
}

