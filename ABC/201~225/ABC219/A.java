import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (0 <= x && x < 40) {
            System.out.println(40 - x);
        } else if (40 <= x && x < 70) {
            System.out.println(70 - x);
        } else if (70 <= x && x < 90) {
            System.out.println(90 - x);
        } else {
            System.out.println("expert");
        }
        sc.close();
    }
}