package PatternQues;

public class pattern12 {

    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(b);
                } else {
                    System.out.print(a);
                }
            }
            System.out.println();

        }

    }
}
