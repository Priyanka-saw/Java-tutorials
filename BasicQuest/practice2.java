import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente number");
        // int CheckNum = sc.nextInt();


        //even or odd
        // if(CheckNum % 2 == 0){
        //     System.out.println("Even number " + CheckNum);
        // } else {
        //     System.out.println("Odd number " + CheckNum);
        // }


        //check prime no
        // int count = 0;
        // for (int i = 2; i*i <= CheckNum; i++) {
        //     if(CheckNum % i == 0){
        //       count++;
        //       break;
        //     }
        // }
        // if(count == 0){
        //     System.out.println("prime no");
        // } else {
        //     System.out.println("not prime no");
        // }


        //fibonacci number
        // int a = 0;
        // int b = 1;
        // for (int i = 0; i <= CheckNum; i++) {
        //     System.out.println(a);
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }

        //swapping
        // int CheckNum2 = sc.nextInt();

        //  CheckNum = CheckNum ^ CheckNum2;
        //  CheckNum2 = CheckNum ^ CheckNum2;
        //  CheckNum = CheckNum ^ CheckNum2;
        //  System.out.println(CheckNum + " " + CheckNum2);

        // int temp = CheckNum;
        // CheckNum = CheckNum2;
        // CheckNum2 = temp;
        // System.out.println(CheckNum + " " + CheckNum2);

        // CheckNum = CheckNum + CheckNum2;
        // CheckNum2 = CheckNum - CheckNum2;
        // CheckNum = CheckNum - CheckNum2;
        // System.out.println(CheckNum + " " + CheckNum2);


        //reverse number
        // while (CheckNum > 0) {
        //     int rem = CheckNum % 10;
        //     CheckNum = CheckNum / 10;
        //     System.out.println(rem);
        // }

        //armstrong number
        // int arm = 0;
        // int temp = CheckNum;
        // while(CheckNum > 0){
        //     int rem = CheckNum % 10;
        //     CheckNum = CheckNum / 10;
        //     arm = arm + rem * rem * rem;

        // }
        // if(temp == arm){
        //     System.out.println("armstrong");

        // }else{
        //     System.out.println("not armstromg");
        // }

        //number of digits
        // int digit = 0;
        // while (CheckNum != 0) {
        //     CheckNum = CheckNum / 10;
        //     digit++;
        // }
        // System.out.println(digit);

        //sum of the digits
        // int sum = 0;
        // for (int i = 0; i <= CheckNum; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);
    }
        
}
 
