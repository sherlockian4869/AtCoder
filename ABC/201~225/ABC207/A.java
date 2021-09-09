import java.util.Arrays;
import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);
 
        int[] num = new int[3];
 
        int a = scan.nextInt();
        num[0] = a;
        int b = scan.nextInt();
        num[1] = b;
        int c = scan.nextInt();
        num[2] = c;
 
        Arrays.sort(num);
 
        int result = num[1] + num[2];
 
        System.out.println(result);
 
    }
}