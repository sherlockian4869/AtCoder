import java.util.Scanner;
public class C {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] list = new long[n];
        long box = 0;
        long count = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextLong();
            if(i != 0) {
                if(box > list[i]) {
                    count = count + box - list[i];
                } else {
                    box = list[i];
                }
            } else {
                box = list[0];
            }
        }
        System.out.println(count);

        scan.close();
    }
}