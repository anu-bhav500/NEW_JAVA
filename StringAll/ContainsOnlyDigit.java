package StringAll;

import java.util.*;
public class ContainsOnlyDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   // Input string
        System.out.println(isDigitsOnly(str));
        sc.close();
    }

    public static boolean isDigitsOnly(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}


