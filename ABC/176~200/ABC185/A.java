import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[4];
        int box = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
            if (i == 0) {
                box = list[0];
            } else {
                if (box > list[i]) {
                    box = list[i];
                }
            }
        }
        System.out.println(box);
        sc.close();
    }
}