import java.util.*;
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        if((a * b) > d || (a * c) < d){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}