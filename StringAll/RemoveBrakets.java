package StringAll;
/* Problem Statement: Given an algebraic expression, write a program to remove brackets from the algebraic expression.

Examples
Input: “a+((b-c)+d)”
Output: “a+b-c+d”
Explanation: Removed all the brackets from the algebric expression.

Input: “(((a-b))+c)” 
Output: “a-b+c”
Explanation: Removed all the brackets from the algebric expression. */
import java.util.*;
public class RemoveBrakets {
 
  public static String removevow(String s){
  
   StringBuilder st = new StringBuilder();
   for(int i = 0; i< s.length() ; i++){
    char ch = s.charAt(i);
  
    if(ch == '(' || ch == ')'  ){
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


