import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int result = 0;
        result = n / w;
        System.out.println(result);
        scan.close();
    }
}