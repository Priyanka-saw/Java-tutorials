import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        
        //left rotate by one place
        // arr = {1, 2, 3, 4, 5}
        // arr = {2, 3, 4, 5, 1}

        int[] arr = {1, 2, 3, 4, 5};
        LeftRotateOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int LeftRotateOne(int[] arr){
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;

        return temp;
    }
}
