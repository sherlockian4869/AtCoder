import java.util.Scanner;
import java.lang.*;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = scan.next();
        String[] list = s.split("");

        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("1")) {
                if (i % 2 == 0) {
                    System.out.println("Takahashi");
                    break;
                } else {
                    System.out.println("Aoki");
                    break;
                }
            }
        }

        scan.close();
    }
}