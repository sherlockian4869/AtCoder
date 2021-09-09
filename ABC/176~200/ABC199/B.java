import java.util.Arrays;
import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] max = new int[n];
        int[] min = new int[n];

        for (int i = 0; i < n; i++) {
            max[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            min[i] = scan.nextInt();
        }
        scan.close();

        Arrays.sort(max);
        Arrays.sort(min);
        int result =  min[0] - max[n-1] + 1;
        if(result <= 0) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}