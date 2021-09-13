import java.util.Scanner;
import java.lang.*;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String word01 = scan.next();
        String wort02 = scan.next();
        
        int result = word01.compareTo(wort02);

        if (result > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        scan.close();
    }
}