import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        //prime no : exactly 2 factor 1 and itself

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number...");
        int primeNo = sc.nextInt();

        int count = 0;
        for (int i = 2; i * i <= primeNo; i++) {
            if(primeNo % i == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("prime : " + primeNo);
        }
        else{
            System.out.println("Given no is not prime : " + primeNo);
        }
    }
}
