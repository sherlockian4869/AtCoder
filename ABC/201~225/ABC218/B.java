import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        map.put(7, "g");
        map.put(8, "h");
        map.put(9, "i");
        map.put(10, "j");
        map.put(11, "k");
        map.put(12, "l");
        map.put(13, "m");
        map.put(14, "n");
        map.put(15, "o");
        map.put(16, "p");
        map.put(17, "q");
        map.put(18, "r");
        map.put(19, "s");
        map.put(20, "t");
        map.put(21, "u");
        map.put(22, "v");
        map.put(23, "w");
        map.put(24, "x");
        map.put(25, "y");
        map.put(26, "z");

        int[] list = new int[26];

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
            System.out.print(map.get(list[i]));
        }

        scan.close();
    }
}