import java.util.Scanner;
 
public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
 
        int sum = 0;
        int a = scan.nextInt();
        int[] num = new int[a];
        int b = scan.nextInt();
        int price = 0;
        for(int i = 0; i < num.length; i++) {
            price = scan.nextInt();
            if(i % 2 == 1) {
                price = price - 1;
            }
            num[i] = price;
        }
        scan.close();
        for(int pri : num){
            sum = sum + pri;
        }
        if (sum <= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
 
}