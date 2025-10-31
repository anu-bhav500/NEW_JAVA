/* Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:
The strings s and t can be made identical by:
Mapping 'e' to 'a'.
Mapping 'g' to 'd'. */

package StringAll;
import java.util.*;
public class Isomorphic {
  public static boolean isomorphicString (String s, String t) {
int[] m1 = new int[256];
int[] m2 = new int[256];
int n = s.length();
for (int i = 0; i < n; i++) {
 if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
   m1[s.charAt(i)] = i + 1;
   m2[t.charAt(i)] = i + 1;
 }
    return true;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
String t= sc.nextLine();
sc.close();
if (isomorphicString(s, t)) {
System.out.println("Strings are isomorphic.");
} else {
System.out.println("Strings are not isomorphic.");
}

}

}

