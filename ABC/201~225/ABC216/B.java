import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] list = new String[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextLine();
        }
        scan.close();
    }
}


// import java.util.Scanner;
// public class A {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int i = sc.nextInt();
//         String[] list = new String[i];
//         for (int j = 0; j < 3; j++) {
//             list[i] = sc.nextLine();
//             System.out.println(list[i]);
//         }
//         sc.close();
//     }
// }