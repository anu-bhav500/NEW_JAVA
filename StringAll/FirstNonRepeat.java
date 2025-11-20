/* Find  first Non-repeating characters of a String

Problem:  Given a string, print first non-repeating characters of the string.

Examples:

Example 1:
Input: string = “google”
Output: l

Explanation: Non repeating characters are l 

Example 2:
Input: string = “yahoo”
Output: y
Explanation: Non repeating characters are y  */
package StringAll;
import java.util.*;
public class FirstNonRepeat {
 
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   // Input string
        str = str.toLowerCase();
        sc.close();

        // Store frequency of each character
        int[] freq = new int[26]; // works for all ASCII characters

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)- 'a']++;
        }

        // Print characters with frequency = 1
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && freq[ch - 'a'] == 1) {
                System.out.print(ch);
                found = true;
                break;
                // if (i != str.length() - 1) System.out.print(","); // print comma between
            }
        }

        if (!found)
            System.out.println("No non-repeating characters found");
    }
}

