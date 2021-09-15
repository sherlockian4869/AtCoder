import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int[] box = new int[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        box = list;
        Arrays.toString(box);
        Arrays.toString(list);
        Arrays.sort(list);
        // System.out.println(box.indexOf(list[list.length -2]));
        sc.close();
    }
}