import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        double price = a * 1.08;
        if ((int)price < 206) {
            System.out.println("Yay!");
        } else if ((int)price == 206) {
            System.out.println("so-so");
        } else {
            System.out.println(":(");
        }
    }
}