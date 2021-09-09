import java.util.Scanner;
public class A {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();   
        int b = scan.nextInt();
        scan.close();
 
        int sum = a + b;
 
        switch(sum){
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("2");
                break;
            case 2:
                System.out.println("1");
                break;
            case 3:
                System.out.println("0");
                break;
            case 4:
                System.out.println("2");
                break;
        }
    }
}