import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt()*100;
        int result = 0;

        int[] list = new int[n];
        
        for (int i = 0; i < list.length; i++) {
            int v = sc.nextInt();
            int p = sc.nextInt();
            list[i] = v*p;
            // 計算
            result += list[i];
            if (x < result) {
                System.out.println(i + 1);
                break;
            }
        }

        if (result <= x) {
            System.out.println("-1");
        }
        sc.close();
    }
}