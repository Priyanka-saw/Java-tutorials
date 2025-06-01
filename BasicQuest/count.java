import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int digit = 0;
        while (num != 0) {
            num = num / 10;
            digit++;
        }
        System.out.println("digit of the number is : " + digit);
    }
}