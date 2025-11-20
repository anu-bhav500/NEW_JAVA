/* Given a String remove all the duplicate characters from the given String.

Examples
Input: s = "bcabc"
Output: "bca" 
Explanation: Duplicate characters 'b' and 'c' are removed

Input: s = "cbacdcbc" 
Output: "cbad"
Explanation: Duplicate characters 'b' and 'c' are removed */

package StringAll;
import java.util.*;
public class RemoveDuplicat {
  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    StringBuilder sb = new StringBuilder();
    boolean[] seen = new boolean[256];
    for(int i =0; i < str.length(); i++){
      char ch = str.charAt(i);
      if(!seen[ch]){
        sb.append(ch);
        seen[ch] = true;
      }
    } 
    System.out.println(sb.toString());   
}}