/* Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array. */
import java.util.*;
public class SmallestArray {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();
        int arr[] = new int[n];


        // Read array elements
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Find smallest element
        int min = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // Output smallest element
        System.out.println(min);
    }
}


