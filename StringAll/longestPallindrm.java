package StringAll;
/* Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters. 
Letters are case sensitive, for example, 
"Aa" is not considered a palindrome. 
Example 1: 
Input: s = "abccccdd" 
Output: 7 
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7. 
Example 2: 
Input: s = "a" 
Output: 1 
Explanation: The longest palindrome that can be built is "a", whose length is 1. with main function */
import java.util.*;
public class longestPallindrm {
  public static int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        int res = 0;
        for(int i = 0 ; i < 128 ; i++){
            int val = freq[i];
            res += (val/2)*2;
            if(res%2 == 0 && val%2 != 0){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      System.out.println(longestPalindrome(s));
      sc.close();
    }
}
