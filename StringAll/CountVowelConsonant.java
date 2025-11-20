package StringAll;
/* Problem Statement: Given a string, write a program to count the number of vowels, consonants, and spaces in that string.

Examples:

Example 1:
Input: string str=”Take u forward is Awesome”
Output: 
Vowels: 10
Consonants: 11
White spaces: 4
Explanation: 



Example 2:
Input: string str=”India won the cricket match”
Output:
Vowels: 8
Consonants: 15
White spaces: 4 */
import java.util.*;
public class CountVowelConsonant {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    str = str.toLowerCase();
    int v = 0 , c = 0 , s = 0;
    for(int i =0; i<str.length(); i++){
     char ch = str.charAt(i);
     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u'){
      v++;
     }
     else if(ch > 'a' && ch < 'z'){
      c++;
     }
     else if(ch == ' ') { s++; } }
    System.out.println("vowels" + v);
     System.out.println("consonants" + c);
      System.out.println("spaces" + s);
  }


}
