import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int result = 0;
        
        result = a ^ b;

        System.out.println(result);
    }
}