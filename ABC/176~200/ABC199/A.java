import java.util.Scanner;
import java.lang.Math;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        c = Math.pow(c, 2);
        
        if (a + b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}