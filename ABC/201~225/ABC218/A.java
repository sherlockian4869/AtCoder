import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String word = scan.next();
        String[] list = word.split("");

        if (list[n - 1].equals("o")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}