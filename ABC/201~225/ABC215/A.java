import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String word = "Hello,World!";
        String s = scan.next();
        if (word.equals(s)) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
        scan.close();
    }
}