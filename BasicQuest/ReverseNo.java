import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        
        //123 --> 321
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number..");
        int rev = sc.nextInt();

        while (rev > 0) {
            int rem = rev % 10;
            rev = rev / 10;
            System.out.print(rem);
        }
    }
}
