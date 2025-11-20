package BasicMathAll;
import java.util.Scanner;

public class GpseriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter common ratio (r): ");
        double r = sc.nextDouble();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        double sum;

        if (r == 1) {
            // Special case: all terms are same
            sum = a * n;
        } else {
            // Using G.P. sum formula
            sum = a * (1 - Math.pow(r, n)) / (1 - r);
        }

        System.out.println("Sum of the G.P. series: " + sum);

        sc.close();
    }
}
