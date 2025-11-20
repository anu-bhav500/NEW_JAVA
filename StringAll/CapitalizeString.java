package StringAll;
/* Problem Description: Given a string, write a program to capitalize the first and last character of each word of that string.

Examples
Input: str = "take u forward is awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: We get the result after capitalizing the first and last character of each word of a string.

Input: str = "I am a boy"
Output: "I AM A BoY" 
Explanation: First and last letter of each word is capitalized. */

import java.util.*;
public class CapitalizeString {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // Input string
        sc.close();
        
        String[] words = str.split("\\s+");  // Split by one or more spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int len = word.length();
            if (len == 1) {
                // If single-letter word, make it uppercase
                result.append(Character.toUpperCase(word.charAt(0)));
            } else {
                // Capitalize first and last character
                char first = Character.toUpperCase(word.charAt(0));
                char last = Character.toUpperCase(word.charAt(len - 1));
                String middle = word.substring(1, len - 1);
                result.append(first).append(middle).append(last);
            }
            result.append(" "); // Add space between words
        }

        System.out.println(result.toString().trim()); // Print final result
    }
}


