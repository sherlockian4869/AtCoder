import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if (a > b) {
			System.out.println("Takahashi");
		} else if (a < b) {
			System.out.println("Aoki");
		} else {
			if (c == 0) {
				System.out.println("Aoki");
			} else {
				System.out.println("Takahashi");
			}
		}
	    scan.close();
    }
}