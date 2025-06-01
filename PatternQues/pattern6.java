package PatternQues;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        //upright angle with numbers
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
