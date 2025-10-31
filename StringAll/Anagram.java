package StringAll;

/*  Write a program to check whether two given strings are anagrams of each other or not.Two
 strings are said to be anagrams if they contain the same characters with the same
 frequency, but possibly in a different order.Print "Anagrams" if the two strings are
 anagrams. Otherwise, Print "Not Anagrams" .
 TestCase2:
 ball
 bell
 Output
 Not Anagrams
 TestCase1:
 silent
 listen
 Output
 Anagram */
import java.util.*;
public class Anagram {
public static boolean isAnagram(String str1 , String str2){
  str1 = str1.toLowerCase();
  str2 = str2.toLowerCase();
   if(str1.length() != str2.length()){
      return false;
    }
    int[] freq = new int[26];
    for(int i =0; i< str1.length(); i++){
      freq[str1.charAt(i)-'a']++;
      freq[str2.charAt(i)-'a']--;
    }
    for(int count : freq){
      if(count!=0){
       return false;
      }
}
return true;
}
  public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    String str1 = SC.nextLine();
    String str2 = SC.nextLine();
    if(isAnagram(str1,str2)){
    System.out.println("Anagrams");}
  else { System.out.println("It is not an anagram");}
  SC.close();
}
}