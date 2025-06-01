public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Second largest number is: " + SecLarge(arr));
    }

    public static int SecLarge(int[] arr){
        //assuming that all element is +ve in an array so -1 taking as the seclargest
        int largest = -1, SecLargest = -1;

        //largest number
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        //second largest
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > SecLargest && arr[i] != largest){
                SecLargest = arr[i];
            }
        }
        return SecLargest;
    }
}
