package StringAll;
/* Problem Statement: Given a String, write a program to remove vowels from the String.

Examples
Input: str = “take u forward”
Output: "tk  frwrd" 
Explanation: All vowels are removed from the given String.

Input: str = “I am very happy today” 
Output: "m vry hppy tdy"
Explanation: All vowels are removed from the given String.
  */
  import java.util.*;
public class RemoveVowel {
  public static String removevow(String s){
   s = s.toLowerCase();
   StringBuilder st = new StringBuilder();
   for(int i = 0; i< s.length() ; i++){
    char ch = s.charAt(i);
  
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u'  ){
      continue;
    }
    st.append(ch);
   }
   return st.toString() ;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(removevow(str));
    sc.close();
  }
  
}
