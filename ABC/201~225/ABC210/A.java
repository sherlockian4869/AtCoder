import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();

        int count = n - a;
        int result = 0;
        if (count > 0) {
            result = a * x + count * y;
        } else {
            result = n * x;
        }

        System.out.println(result);
    }
}