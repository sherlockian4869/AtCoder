import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numberList = new int[n];
        
        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        
        for(int i = 0; i < n; i++) {
            String word = scan.next();
            int j = scan.nextInt();
            dictionary.put(j, word);
            numberList[i] = j;
        }
        scan.close();

        Arrays.sort(numberList);
        System.out.println(dictionary.get(numberList[n-2]));
    }
}