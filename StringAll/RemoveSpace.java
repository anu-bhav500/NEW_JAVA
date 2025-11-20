package StringAll;
import java.util.*;
public class RemoveSpace {
 

  public static String removevow(String s){

   StringBuilder st = new StringBuilder();
   for(int i = 0; i< s.length() ; i++){
    char ch = s.charAt(i);
  
    if(ch == ' ' || ch == '\n' || ch == '\t' ){
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


