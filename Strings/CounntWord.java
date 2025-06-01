import java.util.Scanner;

public class CounntWord {
    public static void main(String[] args) {
        
        // String str = "priyanka saw";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to count");
        String str = sc.nextLine();

        int n = str.length();
        int spaces = 0;

        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == ' '){
                spaces = spaces + 1;
            }
        }
        System.out.println(spaces + 1);
    }
}
