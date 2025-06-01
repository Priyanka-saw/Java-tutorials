import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //121 => 121

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        int rev = 0;
       int  temp = num;
        while (num > 0) {
            int remainder  = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;

        }
        if(temp == rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
