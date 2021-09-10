import java.util.Scanner;
import java.util.stream.Stream;
public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String wordA = scan.next();
        String[] listA = wordA.split("");
        String wordB = scan.next();
        String[] listB = wordB.split("");
        int[] numA = Stream.of(listA).mapToInt(Integer::parseInt).toArray();
        int[] numB = Stream.of(listB).mapToInt(Integer::parseInt).toArray();
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < numB.length; i++) {
            sumA += numA[i];
            sumB += numB[i];
        }

        if (sumA > sumB) {
            System.out.println(sumA);
        } else if (sumB > sumA) {
            System.out.println(sumB);
        } else {
            System.out.println(sumA);
        }
        scan.close();
    }
}