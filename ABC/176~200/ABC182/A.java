import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int follower = sc.nextInt() * 2;
        int follow = sc.nextInt();
        int result = 0;

        result = follower + 100 - follow;

        System.out.println(result > 0 ? result : "0");

        sc.close();
    }
}