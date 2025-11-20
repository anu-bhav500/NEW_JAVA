package StringAll;
import java.util.*;
public class CaseTransform {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   // Input string
     System.out.println(changeCase(str));
        sc.close();
    }

    public static String changeCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // lowercase -> uppercase
                result.append((char)(ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                // uppercase -> lowercase
                result.append((char)(ch + 32));
            } else {
                // keep spaces and other chars same
                result.append(ch);
            }
        }

        return result.toString();
    }
}


