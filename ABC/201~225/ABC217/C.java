import java.util.Scanner;
import java.util.Arrays;
public class C {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] list = new Integer[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }
        for (int i = 1; i < list.length + 1; i++) {
            int getIndex = Arrays.asList(list).indexOf(i);
            System.out.print(getIndex + 1 + " ");
        }
        scan.close();
    }
}