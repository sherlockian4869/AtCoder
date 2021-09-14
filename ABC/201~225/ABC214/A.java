import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 1 && n <= 125) {
            System.out.println("4");
        } else if (n >= 126 && n <= 211) {
            System.out.println("6");
        } else {
            System.out.println("8");
        }
        scan.close();
    }
}