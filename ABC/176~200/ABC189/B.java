import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float x = sc.nextFloat();
        float result = 0;

        float[][] list = new float[n][2];
        
        for (int i = 0; i < list.length; i++) {
            list[i][0] = sc.nextFloat();
            list[i][1] = sc.nextFloat();

            // 計算
            result += list[i][0] * list[i][1] / 100;
            System.out.println(result);
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