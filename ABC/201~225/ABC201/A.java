import java.util.Scanner;
import java.util.Arrays;

public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int[] num = new int[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        if ((num[2] - num[1]) == (num[1] - num[0])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}