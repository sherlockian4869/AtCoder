import java.util.*;
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        a = a + b;
        
        if (a >= 15 && b >= 8) {
            System.out.println("1");
        } else if (a >= 10 && b >= 3) {
            System.out.println("2");
        } else if (a >= 3) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}