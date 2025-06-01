public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7};
        System.out.println(isSorted(arr));
    } 

    public static boolean isSorted(int[] arr){

        //i-1 : for non-decending number
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i-1]){
            
            }
            else {
                return false;
            }
        }
        return true;
    }
}
