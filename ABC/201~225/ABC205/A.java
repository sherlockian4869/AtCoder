import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
 
        double num = b * 0.01;
        double ans = a * num;
        System.out.println(ans);
    }
}