/* Problem:  Given a string, print non-repeating characters of the string.

Examples:

Example 1:
Input: string = “google”
Output: l,e

Explanation: Non repeating characters are l,e.

Example 2:
Input: string = “yahoo”
Output: y,a,h
Explanation: Non repeating characters are y,a,h */
package StringAll;
import java.util.*;
public class NonRepeatedChar {
 
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
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                System.out.print((char)(i+'a')+ " ");
                found = true;
                // if (i != str.length() - 1) System.out.print(","); // print comma between
            }
        }

        if (!found)
            System.out.println("No non-repeating characters found");
    }
}


