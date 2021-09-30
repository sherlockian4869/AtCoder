import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        while(a % 10 == 0 && a != 0) {
            a /= 10;
        }
        String po = a + "";
        char[] b = po.toCharArray();
        boolean o = true;
        for (int i = 0; i < b.length; i++) {
            if (b[i] != b[b.length - 1 - i]) {
                o = false;
            }
        }
        System.out.println(o ? "Yes" : "No");
        sc.close();
    }
}
