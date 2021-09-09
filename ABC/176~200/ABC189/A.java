import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String[] list = word.split("");
        for (int i = 0; i < list.length; i++) {
            String str = list[0];
            if (i != 0) {
                if (str == list[i]) {
                    
                }
            }
        }
        scan.close();
    }
}