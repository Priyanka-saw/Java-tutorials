package PatternQues;
import java.util.*;

public class patten9 {

    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);
        // System.out.println("ente  value of n");
        // int n = sc.nextInt();
        int n = 5;

       for (int i = 0; i < n; i++) {
        
        //space 
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        // stars
        for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
            System.out.print("*");
        }
        // space
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        System.out.println();
       }

    }
}