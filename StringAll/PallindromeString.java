package StringAll;
/* You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

Examples :

Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
Input: s = "abc" 
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome. */
import java.util.Scanner;


public class PallindromeString{
  public static boolean isPallindrom(String s){
  s = s.toLowerCase();
  int str = 0; int en = s.length() -1;
  while(str<en){
    if(s.charAt(str) != s.charAt(en)) return false;
    str ++;
    en--;
  }
  return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    if(isPallindrom(s)){
      System.out.println("pallindrome");
    }
    else System.out.println("not pallindrome");
}
}