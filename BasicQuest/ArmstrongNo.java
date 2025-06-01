import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        // 153 --> 1`3 + 5`3 + 3'3 = 153
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number..");
        int num = sc.nextInt();

        int arm = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            num = num/10;
            arm = arm + rem * rem * rem;

        }
        if(temp == arm){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong no");
        }
    }
}
