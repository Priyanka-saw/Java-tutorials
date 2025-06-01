import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        System.out.println(Search(arr)); 
        System.out.println(Arrays.toString(arr));
    }
    public static int Search(int[] arr){
        int num = 3;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==num){
                return i;
            }
        }
        return -1;
    }
}
