import java.util.Arrays;

public class MoveZeroEnd {
    public static void main(String[] args) {
        //move alll zeroes to the end of the array

        //arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1}
                //   {1, 2, 3, 2, 4, 5, 1, 0, 0, 0}
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        System.out.println(ZeroEnd(arr));
        System.out.println(Arrays.toString(arr));

    }

    public static int ZeroEnd(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }
}
