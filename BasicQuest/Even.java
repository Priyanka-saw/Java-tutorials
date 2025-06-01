import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number..");
        int even = sc.nextInt();

        if(even % 2 == 0){
            System.out.println("Even Number : " + even);
        }
        else {
            System.out.println("Given number is Odd : " + even);
        }
    }
}
