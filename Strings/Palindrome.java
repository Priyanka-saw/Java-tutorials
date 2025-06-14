import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            } start ++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrom or not");

       String str = sc.nextLine();
       System.out.println(isPalindrome(str));
    }
}
