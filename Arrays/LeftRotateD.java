import java.util.Arrays;

public class LeftRotateD {
    public static void main(String[] args) {
        
        //left rotate by the D places
        // d = 2
        // arr = {1, 2, 3, 4, 5}
        // arr = {3, 4, 5, 1, 2}

        int[] arr = {1, 2, 3, 4, 5};
        int d = 3;
        LeftRotateDPlace(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    public static void LeftRotateDPlace(int[] arr, int d){
        int n = arr.length;
        d %= n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
