/* Change every letter with next lexicographic alphabet

Mark as Completed

25


Problem Statement: Given a string, write a program to change every letter in the given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a)

Examples:

Example 1:
Input: string str = “abcdxyz”
Output: bcdeyza
Explanation:

Example 2:
Input: string str = “Java”
Output: Kbwb
Explanation:
 */
package StringAll;
import java.util.*;
public class ReplaceCharater {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   // Input string
        sc.close();
        System.out.println(changeLetters(str));
    }

    public static String changeLetters(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i<str.length() ; i++){
          char ch = str.charAt(i);
                    if (ch >= 'a' && ch <= 'z') {
                if (ch == 'z') {
                    result.append('a');
                } else {
                    result.append((char)(ch + 1));
                }
            } 
            else if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'Z') {
                    result.append('A');
                } else {
                    result.append((char)(ch + 1));
                }
            } 
            else {
                // Non-alphabetic characters remain unchanged
                result.append(ch);
            }
        }

        return result.toString();
    }
}


