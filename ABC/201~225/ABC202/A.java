import java.util.*;
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        a = 7 - a;
        b = 7 - b;
        c = 7 - c;
        
        int ans = a + b + c;
        System.out.println(ans);
    }
}