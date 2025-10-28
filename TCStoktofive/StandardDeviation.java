package TCStoktofive;
/*Given an integer n and a list of n integers, write a program to compute the standard
 deviation of the numbers using the formula:
  TestCase:
 5
 2 4 4 4 5
 Output
 0.98
 Input Format:
 First line: An integer n (number of elements in the array)
 Second line: n space-separated integers representing the array elements
 Output Format:
 Print the standard deviation, rounded to 2 decimal place */
 import java.util.*;
public class StandardDeviation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    String[] nums = str.split(" ");
    int[] arr = new int[n];
    double sum = 0;
    for(int i=0; i<n; i++){
    arr[i] = Integer.parseInt(nums[i]);
    sum += arr[i];
    }
    double mean = sum/n;
     double sqrdiffsum = 0;
    for(int i=0; i<n;i++){
     sqrdiffsum +=  Math.pow(arr[i] - mean,2);
    }
    double sd = Math.sqrt(sqrdiffsum/n);
    System.out.printf("%.2f\n", sd);
    System.out.println(mean);
    System.out.println(sqrdiffsum);
    sc.close();
    }
    }

// MUST TAKE MEAN , SD , SUM , VARIANCE ALL ARE IN *DOUBLE* 