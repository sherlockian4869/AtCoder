import java.awt.List;
import java.util.*;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] list1 = new String[]{"2B", "3B", "H", "HR"};
        String[] list2 = new String[4];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = sc.next();
        }
        Arrays.sort(list2);
        System.out.println(Arrays.equals(list1, list2) ? "Yes" : "No");
    }
}