import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        scan.close();
        
        System.out.println(a - 1);
    }
}