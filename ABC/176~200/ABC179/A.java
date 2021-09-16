import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        char word = c[c.length - 1];
        if (word == 's') {
            c[c.length] = 'e';
            c[c.length + 1] = 's';
            
        } else {
            c[c.length] = 's';
        }
        sc.close();
    }
}