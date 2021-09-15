import java.util.Scanner;
import java.lang.Math;
public class C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long[] list = new long[3];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextLong();
        }

        double a = Math.pow(list[0], list[2]);
        double b = Math.pow(list[1], list[2]);

        if (a > b) {
            System.out.println(">");
        } else if(a < b) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }

        sc.close();
    }
}