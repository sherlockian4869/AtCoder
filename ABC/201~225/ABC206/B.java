import java.util.*;
import java.util.Scanner;
 
public class B {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        scan.close();
        int ans = 0;
        int count = 0;
        
        while(ans < a) {
            count++;
            ans = ans + count; 
        }
        
        System.out.println(count);
        
    }
}