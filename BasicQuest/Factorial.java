import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // 5 -> 1 * 2 * 3 * 4 * 5 => 120

        Scanner sc = new Scanner(System.in);
        System.out.println("Ente number : ");
        int num = sc.nextInt();

        int factNO = 1;
        for (int i = 1; i <= num; i++) {
            factNO = factNO * i;

        }
        System.out.println(factNO);
    }
}
