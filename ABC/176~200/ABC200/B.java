import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();
        int k = scan.nextInt();

        String w = "";

        for (int i = 0; i < k; i++) {
            if(n % 200 == 0) {
                n /= 200;
            } else {
                String strN = String.valueOf(n);
                w = strN + "200";
                n = Long.parseLong(w);
            }
        }

        scan.close();
        System.out.println(n);
    }
}