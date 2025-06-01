import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        //0 1 1 2 3 5 8 13...
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente your number: ");
        int fibo = sc.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0; i < fibo; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            
        }
    }
}


// Scanner sc = new Scanner(System.in);
// System.out.println("Ente your number: ");
// int fibo = sc.nextInt();
// fiboo(fibo);
// }

// public static void fiboo(int ab){
// int a = 0;
// int b = 1;
// for (int i = 0; i < ab; i++) {
//     System.out.println(a);
//     int c = a + b;
//     a = b;
//     b = c;

