package TCStoktofive;
/* Problem Statement: Making Triplets Equal
 You are given a triplet of integers (a,b,c). You can perform the following operation any
 number of times:
 Select any two numbers from the triplet. 1.
 Add 1 to both selected numbers. 2.
 Subtract 1 from the remaining number. 3.
 Your task is to determine whether it is possible to make all three numbers equal using the given operations.
 Input:
 A single integer TT representing the number of test cases.
 Each test case consists of three integers a,b,c.
  Example:
 Input:
 3  
1 2 3  
4 4 4  
3 3 7 
Output:-1 
0  
2   */


import java.util.*;

public class triplet {
  public static int minStepToEqual(int P,int Q, int R){
    int[] arr = {P,Q,R};
    Arrays.sort(arr);
    if(arr[0] == arr[1] && arr[1] == arr[2] ){
      return 0;
    }
    int step = 0;
    while(true){
      arr[0] += 1;
      arr[1] += 1;
      arr[2] -= 1;
      step++ ;
      Arrays.sort(arr);

       if(arr[0] == arr[1] && arr[1] == arr[2] ){
      return step;
    }
      if((arr[0] == arr[1] && arr[1] +1 == arr[2]) || (arr[1] == arr[2] && arr[0] + 1 == arr[1]) ){
      return -1;
      }

    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // number of test cases
   while(T-->0){
    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();
    System.out.println(minStepToEqual(P,Q,R));
   }
   sc.close();
  }
}
