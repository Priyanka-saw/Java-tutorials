import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to swap..");
        int firstNum = sc.nextInt();
        int SecondNum = sc.nextInt();

        System.out.println("before swaping");

        System.out.println(firstNum + " " + " " + SecondNum);
        firstNum = firstNum ^ SecondNum;
        SecondNum = firstNum ^ SecondNum;
        firstNum = firstNum ^ SecondNum;

        System.out.println("after Swaping");
        System.out.println(firstNum + " " + " " + SecondNum);
    }
}
