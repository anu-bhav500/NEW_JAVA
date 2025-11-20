package StringAll;
/* Problem Statement: Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them.

Examples
Input: str = “takeuforward”
Output: a
Explanation: 
The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them.

Input: str = "apple"
Output: p
Explanation: 
The character 'p' have the maximum occurrence i.e 2. */

import java.util.*;
public class maxOccurent {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    str = str.toLowerCase();
    int[] freq = new int[26];
    for(int i = 0; i < str.length(); i++){
      freq[str.charAt(i) -'a']++;

    }
    int maxFreq = 0;
    char maxChar = ' ';
    for(int i = 0; i< 26; i++){
      if(freq[i] > maxFreq){
        maxFreq = freq[i];
        maxChar = (char)(i + 'a');
      // System.out.print((char)(i + 'a')+ " "+ freq[i]+ " ");
      }
    }
    System.out.println(maxChar);

  }
}

