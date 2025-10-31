package StringAll;
/*Given a space-separated string of words, write a function to count the frequency of each word in the string. The output should display each unique word followed by its frequency, with the words in the order of their first appearance. The output should capitalize the first letter of each word.
Example:
Input:
apple banana apple banana apple orange banana
Output:
apple 3 banana 2 orange 1*/
import java.util.*;
public class Frequency {
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
sc.close();
String[]  words = str.trim().split("\\s+");
LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
for(String w : words){
map.put( w, map.getOrDefault(w,0)+1);
}
for(String key : map.keySet()){
String cap = key.substring(0,1).toUpperCase() + key.substring(1);
System.out.print(cap+ " " + map.get(key) + " " );
}
}
}
