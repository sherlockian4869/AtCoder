import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        if (Math.abs(a - b) < 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}