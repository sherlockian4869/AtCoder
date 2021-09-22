import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] list = new String[n];

        for (int i = 0; i < list.length; i++) {
            String s = sc.next();
            String t = sc.next();

            list[i] = s + " " + t;
        }
        String res = "No";
        myLoop:
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].equals(list[j])) {
                    res = "Yes";
                    break myLoop;
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}