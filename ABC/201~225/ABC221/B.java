import java.util.*;

public class B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int len = s.length();

        if (s.equals(t)){
            System.out.println("Yes");
            return;
        }

        for (int i = 0; i < len-1; i++){
            String str = s.substring(0,i) + s.charAt(i+1) + s.charAt(i) + s.substring(i+2);
            if (str.equals(t)){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}