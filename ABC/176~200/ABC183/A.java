import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i >= 0) {
            System.out.println(i);
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}