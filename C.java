import java.util.Scanner;
public class C {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] list = new int[n];
        int box = 0;
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
            box = list[0];
            if(i != 0) {
                if(box > list[i]) {
                    box = list[i-1];
                    System.out.println(box);
                    count += box - list[i];
                    System.out.println(count);
                }
            }
        }
        System.out.println(count);

        scan.close();
    }
}