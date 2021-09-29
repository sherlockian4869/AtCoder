import java.util.Scanner;
public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] list = sc.next().split("");
        int[] pass = new int[list.length];
        String ans = "Weak";
        for (int i = 0; i < pass.length; i++) {
            pass[i] = Integer.parseInt(list[i]);
        }
        myLoop:
        for (int i = 0; i < pass.length; i++) {
            if (i!=0) {
                if(pass[i-1]+1!=pass[i]) {
                    if(!(pass[i-1]==9 && pass[i]==0)) {
                        ans = "Strong";
                        break myLoop;
                    }
                }
            }
        }
        if (pass[0] == pass[1] && pass[1] == pass[2] && pass[0] == pass[3]) {
            ans = "Weak";
        }
        System.out.println(ans);
        sc.close();
    }
}