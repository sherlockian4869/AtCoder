import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<String> wordList = new ArrayList<String>();
        wordList.add("ABC");
        wordList.add("ARC");
        wordList.add("AGC");
        wordList.add("AHC");
        String word = "";

        for (int i = 0; i < 3; i++) {
            word = scan.next();
            wordList.remove(wordList.indexOf(word));
        }
        scan.close();
        System.out.println(wordList.get(0));
    }
}