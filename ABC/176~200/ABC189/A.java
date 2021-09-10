import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String[] list = word.split("");
        String str = list[0];
        for (int i = 0; i < list.length; i++) {
            if (i != 0) {
                if (str.equals(list[i])) {
                    str = list[i];
                    if(i == list.length - 1) {
                        System.out.println("Won");
                    }
                } else {
                    System.out.println("Lost");
                    break;
                }
            }
        }
        scan.close();
    }
}