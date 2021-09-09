import java.util.*;
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if(a == b) {
            System.out.println(c);
        } else if(a == c) {
            System.out.println(b);
        } else if(c == b) {
            System.out.println(a);
        } else {
            System.out.println("0");
        }
    }
}