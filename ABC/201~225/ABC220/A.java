import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = c * 2;
        if (a <= c && c <= b) {
            System.out.println(c);
        } else if (a <= result && result <= b) {
            System.out.println(result);
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}