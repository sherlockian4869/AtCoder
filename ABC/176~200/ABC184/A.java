import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[4];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        int result = list[0] * list[3] - list[1] * list[2];
        System.out.println(result);
        sc.close();
    }
}