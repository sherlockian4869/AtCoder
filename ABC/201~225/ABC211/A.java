import java.util.*;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = 0;

        c = (a - b) / 3 + b;

        System.out.println(c);
    }
}