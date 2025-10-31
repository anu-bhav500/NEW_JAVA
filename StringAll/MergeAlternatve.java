package StringAll;
/* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r */
import java.util.*;
public class MergeAlternatve {
  
	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
		String merg = "";
		int i = 0;
		for(i = 0; i<str1.length() && i<str2.length() ; i++){
			merg += str1.charAt(i);
			merg += str2.charAt(i);
		}
		if(str1.length()> str2.length()){
			merg += str1.substring(i);
		}
		else if(str2.length()> str1.length()){
			merg += str2.substring(i);
		}
		System.out.print(merg);
		
			
		}

	
}
