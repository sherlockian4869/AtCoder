import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        long ans = 0;
        for (int i = 0; i <= s; i++) {
            for (int j = 0; j <= s-i; j++) {
                for (int k = 0; k <= s-i-j; k++) {
                    if(i * j * k <= t) {
                        ans++;
                    }
                }
            }
        }
        sc.close();
        System.out.println(ans);
    }
}