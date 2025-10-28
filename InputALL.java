import java.util.*;
public class InputALL {
  public static void main(String[] args) {

  // CASE 1 : When size of array is given exp : N = 5 , arr = 1,2,3,4,5
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<=n ; i++){
      arr[i] = sc.nextInt();
    }
    // printing 
    for(int i = 0; i<= n; i++){
      System.out.println(arr[i] + " ");
    }
    sc.close();


    // CASE 2 : When size of array is given , Array is dynamic exm : N = 5 , arr = 1,2,3,4,5
    Scanner scc = new Scanner(System.in);
    int m = scc.nextInt();
    ArrayList<Integer> List = new ArrayList<>();
    for(int i=0; i<n; n++){
      List.add(scc.nextInt());
    }
           // printing using simple loop
    for(int i = 0; i< n; i++){
      System.out.println(List.get(i)+ " ");
    }
           // pinting using for-each loop
    for(int ele : List){
      System.out.println(ele + " ");
    }
    scc.close();


    // CASE 3 : If size of array is not given, space seperated value is given , exm : arr = 1 2 3 4 5
    Scanner sm = new Scanner(System.in);
    String str = sm.nextLine(); // str = "1 2 3 4 5"
    String nums[] = str.split(" ");
    ArrayList<Integer> list = new ArrayList<>();
    for(String num : nums){
      list.add(Integer.parseInt(num));
    }
           // print the elements
     for(int ele : list)   {
      System.out.println(ele +  " ");
     }   
      sm.close();


     // CASE 4 : If size is not given, comma seperated value is given , exm: arr = 1 ,2 ,3, 4, 5
     Scanner sn = new Scanner(System.in);
    String stk = sn.nextLine(); // str = "1, 2, 3, 4, 5"
    String numss[] = stk.split(" , "); // main difference just comma
    ArrayList<Integer> Liist = new ArrayList<>();
    for(String num : numss){
      list.add(Integer.parseInt(num));
    }
           // print the elements
     for(int ele : Liist)   {
      System.out.println(ele +  " ");
     }   
     sn.close();


    // CASE 5 : If size of array is not given , comma seperated value with BRACKETS exm : arr = {1,2,3,4,5} OR arr = [1,2,3,4,5] OR arr = (1,2,3,4,5)
     Scanner sccc = new Scanner(System.in);
    String sth = sccc.nextLine();   // str = "{1, 2, 3, 4, 5}"
    if(sth.startsWith("{") && sth.endsWith("{")){ // for bracket handling 
      str = str.substring(1, str.length()-1);
    }
    String arrr[] = sth.split(" , "); // main difference just comma
    ArrayList<Integer> liist = new ArrayList<>();
    for(String num : arrr){
      list.add(Integer.parseInt(num));
    }
           // print the elements
     for(int ele : liist)   {
      System.out.println(ele +  " ");
     }   
     sccc.close();


     // CASE 6 : Scanner is not working , take BufferedReader --> see the read.java file 


     // CASE 7 : When input is taking first integer and then 

     /* Then just after taking integer input --> write sc.nextLine(); --> then takes string input  */
     
  }
}
