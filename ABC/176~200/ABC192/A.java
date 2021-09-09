import java.util.*;
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        
        int ans = 100 - (a % 100);
        System.out.println(ans);
    }
}