import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(0 < a && b == 0) {
            System.out.println("Gold");
        } else if(a == 0 && 0 < b) {
            System.out.println("Silver");
        } else if(0 < a && 0 < b) {
            System.out.println("Alloy");
        }

        scan.close();
    }
}