package BasicMathAll;
/*Question: Decimal to Binary Conversion
 Input: 12
 Output: 1100 */
 import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal /= 2;
        }

        System.out.println(binary.reverse());
        sc.close();
    }
}
 

