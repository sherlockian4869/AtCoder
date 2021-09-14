import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputs = scan.nextLine().split("\\.");
        int d = Integer.valueOf(inputs[1]);
        System.out.println(inputs[0] + (d <= 2 ? "-" : d >= 7 ? "+" : ""));
        scan.close();
    }
}