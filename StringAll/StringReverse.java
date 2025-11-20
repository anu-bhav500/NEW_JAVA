package StringAll;
/* You are given a string s, 
and your task is to reverse the string. 
Examples: 
Input: 
s = "Geeks" 
Output: "skeeG" 
Input: s = "for" 
Output: "rof" Input: s = "a" Output: "a" */
import java.util.*;
public class StringReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    char[] arr = s.toCharArray();
    int st = 0; int en = arr.length - 1;
    while(st<en){
      char temp = arr[st];
      arr[st] = arr[en];
      arr[en] = temp;
      st ++; en--;
     }
     System.out.println(new String(arr));
  }
}
