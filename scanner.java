import java.util.*;
public class scanner {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char c = sc.next().charAt(0);
    sc.nextLine(); // must add this line -->  whenver primitive data type(integer) to non primitive datatype (String or Array) then must add sc.nextLine()
    String s = sc.nextLine();
    System.out.println(n+" "+c+" "+s);
    sc.close();

    double val = Math.PI;
    System.out.println(val);
    System.out.printf("%.2f" , val);
  }
}
