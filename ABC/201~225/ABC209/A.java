import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);
 
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
 
        int ans = b - a + 1;
        if(ans < 0) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}