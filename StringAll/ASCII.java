package StringAll;
/* Problem Statement: Given a character, Find the ASCII value of the character.

Examples:

Example 1:
Input: c = ‘A’
Output: 65
Explanation: ASCII value of A is 65

Example 2:
Input: c = ‘e’
Output: 101
Explanation: ASCII value of e is 101 */
import java.util.*;
public class ASCII {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    int ascii = c;
    System.out.println(ascii);
    

    /* ASCII SUM OF STRING  */
     String str = sc.nextLine();
     int sum = 0;
     for(int i = 0; i< str.length(); i++){
       sum += str.charAt(i);
     }
     System.out.println(sum);
     sc.close();
  }
}
