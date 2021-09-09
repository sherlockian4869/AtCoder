import java.util.*;
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        String[] list1 = scan.nextLine().split("");
        String[] list2 = new String[list1.length];
        list2[0] = list1[1];
        list2[1] = list1[2];
        list2[2] = list1[0];
        for(int i = 0; i < list2.length; i++) {
            System.out.print(list2[i]);
        }
        
    }
}