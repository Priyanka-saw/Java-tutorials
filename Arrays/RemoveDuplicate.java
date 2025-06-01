import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        //remove duplicate in place of sorted array
        int[] arr = {1, 2, 4, 5, 5, 6};

        System.out.println(Arrays.toString(arr));
        System.out.println(ReDuplcate(arr));  
    }
    public static int ReDuplcate(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[i]){
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return (i + 1);
    }
}
