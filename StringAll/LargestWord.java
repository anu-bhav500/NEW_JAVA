/* Problem: Given a String, find the largest word in the string.

Examples:

Example 1:
Input: string s=”Google Doc”
Output: “Google”

Explanation: Google is the largest word in the given string.

Example 2:
Input: string s=”Microsoft Teams”
Output: “Microsoft”
Explanation: Microsoft is the largest word in the given string */
package StringAll;
import java.util.*;
public class LargestWord {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   // Input string
      System.out.println(findLargestWord(str));
        sc.close();
    }

    public static String findLargestWord(String str) {
        // Split string by space
        String[] words = str.split(" ");

        String largestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                largestWord = word;
            }
        }

        return largestWord;
    }
}


