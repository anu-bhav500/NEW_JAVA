import java.io.*;
public class read{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name = br.readLine();
    System.out.println(name);

    // int input
    int number = Integer.parseInt(br.readLine());
    System.out.println(number);

    // double input
    double num= Double.parseDouble(br.readLine());
  }
}