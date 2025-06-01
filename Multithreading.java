import java.util.Scanner;

public class Multithreading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter somthing..");
        int CheckNum = sc.nextInt();
        // System.out.println(Thread.currentThread().getName());

        long startTime = System.currentTimeMillis();

        //without multithreading
        //number of digits
        int digit = 0;
        while (CheckNum != 0) {
            CheckNum = CheckNum / 10;
            digit++;
        }
        
        //sum of the digits
        int sum = 0;
        for (int i = 0; i <= CheckNum; i++) {
            sum = sum + i;
        }

        System.out.println(digit);
        System.out.println(sum);

        System.out.println("time taken :" + (System.currentTimeMillis() - startTime) + "ms");


    }
}
