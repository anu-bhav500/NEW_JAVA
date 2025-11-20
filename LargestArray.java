/* Problem Statement: Given an array, we have to find the largest element in the array.

Examples

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array.  */
import java.util.*;
public class LargestArray {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  // int n = sc.nextInt();
  // int[] arr = new int[n];
  String str = sc.nextLine();
  String[] nums = str.trim().split(" ");
  int[] arr = new int[nums.length];
  for(int i =0; i<nums.length ; i++){
    arr[i] = Integer.parseInt(nums[i]);

  }
  sc.close();
  int max = Integer.MIN_VALUE;
  for(int i =0 ; i< arr.length ; i++){
    if(arr[i] > max){
      max = arr[i];
    }
  }
  System.out.println(max);
  }
}
