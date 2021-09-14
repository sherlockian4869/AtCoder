import java.util.Scanner;
import java.math.*;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String numberStr = scan.next();
        BigDecimal numberDec = new BigDecimal(numberStr);
        BigDecimal number = numberDec.setScale(0, RoundingMode.DOWN);
        System.out.println(number);
        scan.close();
    }
}