import java.util.Arrays;
import java.util.Scanner;

public class OneShot {
    public static void main(String[] args) {
 
        //function declerations
        sum(12, 34);

        // DataTypes
        int a = 1234567891;
        byte b = 123;
        short c = 12345;
        long d = 12345678915L;

        boolean isAdult = true;
        isAdult = false;

        char ab = 'a';
        // System.out.println(ab);
        // System.out.println((char) 10084);

        // string creation method
        String s1 = "priyanka"; // string literals
        String s2 = new String("priyanka"); // using constructor

        System.out.println(s1 + " " + s2);
        System.out.println(s1.equals(s2));

        // string
        String name = "priyanka";
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.substring(1, 5));
        System.out.println(name.trim());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Arithmetic operators
        int add = 12 + 1;
        int sub = 12 - 1;
        int mul = 12 * 1;
        int div = 12 / 1;
        int mod = 12 % 1;
        System.out.println(add + " " + sub + " " + mul + " " + div + " " + mod);

        // inncrement and decrement
        int value = 1;
        System.out.println(value);
        value++;
        System.out.println(value);

        value--;
        System.out.println(value);

        ++value;
        System.out.println(value);

        --value;
        System.out.println(value);

        // bitwize operator
        // && || ! ^ << >>

        // relational operator
        // < > <= >= == !=
        // it give boolean value

        // logical value
        // && || !
        System.out.println(1 != 2 && 1 < 2);
        System.out.println(1 == 2 || 2 <= 4);

        // conditional operator
        boolean isSunny = true;
        boolean isWarm = true;

        if (isSunny) {
            System.out.println("sunny day");
        } else {
            System.out.println("not sunny day");
        }


        String dayname;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter daynumber: " );
        // int day = sc.nextInt();

        // if (day == 1) {
        //     dayname = "monday";
        //     System.out.println(dayname);
        // } else if (day == 2) {
        //     dayname = "tues";
        //     System.out.println(dayname);

        // } else if (day == 3) {
        //     dayname = "wed";
        //     System.out.println(dayname);

        // } else if (day == 4) {
        //     dayname = "thur";
        //     System.out.println(dayname);

        // } else if (day == 5) {
        //     dayname = "fri";
        //     System.out.println(dayname);

        // } else {
        //     System.out.println("default value");
        // }


        //switch case
        int day2 = 14;
        String nameval;
        switch (day2) {
            case 1:
                nameval = "jan";
                break;
            case 2:
                nameval = "jan";
                break;
            case 3:
                nameval = "jan";
                break;
            case 4:
                nameval = "jan";
                break;
            case 5:
                nameval = "jan";
                break;
        
            default:
            nameval = "default value";
                break;
        }
        System.out.println(nameval);


        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
 
        // while 
        int j = 1;
        while (j <= 5) {
            System.out.println("priyanka");
            j++;
        }
        
        //do while
        int k = 1;
        do {
            System.out.println("Welcome to india");
            k++;
        } while (k <= 5);



        //Arrays
        int[] ac = new int[5];
        ac[0] = 1;
        ac[1] = 11;
        ac[2] = 111;
        ac[3] = 1111;

        //most convient way of printing all values in the form of arrays 
        // System.out.println(Arrays.toString(ac));

        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
        }
        //array is used to storre similar type of the data for integer type, boolean types
        int[] arr1 = {1, 2, 3, 4, 5};
        for (int i : arr1) {
<<<<<<< HEAD
            System.out.println("for each loop : " + i);
            
        } 
=======
            System.out.println("for each loop : " + i);   
        }        
>>>>>>> 530befcec69dbbdd3a0099858e5896b06479262f
    }
       //function
        public static void sum(int a, int b){
            int summ = a + b;
            System.out.println("sum of the number is " + (summ));
        }
       
}
