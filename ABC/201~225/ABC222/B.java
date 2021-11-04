import java.util.Scanner;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < p) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}