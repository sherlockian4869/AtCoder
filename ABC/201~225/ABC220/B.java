import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();

        long numA = Long.parseLong(a, n);
        long numB = Long.parseLong(b, n);

        System.out.println(numA * numB);
        sc.close();
    }
}