
import java.util.Scanner;

public class reverseStr {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String Name = sc.nextLine();

        char ch;
        String noString = " ";
        for (int i = 0; i < Name.length(); i++) {
            ch = Name.charAt(i);
            noString = ch + noString;
        } 
        System.out.println(noString);
    
    }
}
