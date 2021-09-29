import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[3];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.next();
        }
        String str = sc.next();
        String[] strList = str.split("");
        for (int i = 0; i < strList.length; i++) {
            int n = Integer.parseInt(strList[i]);
            System.out.print(list[n - 1]);
        }
        sc.close();
    }
}