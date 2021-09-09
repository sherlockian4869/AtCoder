import java.util.*;
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(b % a == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}