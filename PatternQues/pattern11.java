package PatternQues;

public class pattern11 {
    public static void main(String[] args) {
        int n = 5;

        // upward
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // downward
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
