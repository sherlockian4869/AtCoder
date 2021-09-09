import java.util.*;
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextInt();
        double b = scan.nextInt();
        double ans = (1 - (b / a)) * 100;
        System.out.println(ans);
    }
}