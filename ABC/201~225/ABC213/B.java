import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] number = new Integer[n];
        Integer[] sortNumber = new Integer[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            sortNumber[i] = number[i];
        }
        Arrays.sort(sortNumber);
    
        int x = Arrays.asList(number).indexOf(sortNumber[n - 2]) + 1;

        System.out.println(x);
        sc.close();
    }
}