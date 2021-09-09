import java.util.*;
import java.util.Scanner;
import java.lang.Math;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextInt();
        double ans = a / 100;
        ans = Math.ceil(ans);
        
        System.out.println((int)ans);
        
    }
}