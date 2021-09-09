import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        String ans = "Yes";
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            if (!(b[i] == (i + 1))) {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}