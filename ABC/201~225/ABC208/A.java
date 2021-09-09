import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);
 
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int max = a * 6;
        if (a <= b && b <= max) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}