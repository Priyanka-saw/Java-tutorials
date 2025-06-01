package PatternQues;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        //upright angle

        for (int i = 1; i <= n; i++) { //row 
            for (int j = 0; j < n-i+1; j++) {  //n - i + 1 (5 - 1 + 1)
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
