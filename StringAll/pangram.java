/* Given a string s, the task is to check if it is Pangram or not. 
A pangram is a sentence containing all letters of the English Alphabet.

Examples: 

Input: s = "The quick brown fox jumps over the lazy dog" 
Output: true
Explanation: The input string contains all characters from ‘a’ to ‘z’.

Input: s = "The quick brown fox jumps over the dog"
Output: false
Explanation: The input string does not contain all characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing */
package StringAll;
import java.util.*;
public class pangram {
 
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPangram(str));
        sc.close();
    }

    public static boolean isPangram(String s) {
        // convert to lowercase
        s = s.toLowerCase();

        // boolean array for 26 letters
        boolean[] present = new boolean[26];

        // mark each letter found
        for(int i = 0; i< s.length() ; i++){
          char ch = s.charAt(i);
          if(ch >= 'a' && ch <= 'z' ){
            present[ch - 'a'] = true;
          }

        }

        // check if all are true
        for (boolean exists : present) {
            if (!exists) {
                return false;
            }
        }
        return true;
    }
}


