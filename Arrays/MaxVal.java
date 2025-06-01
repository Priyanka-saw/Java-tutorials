public class MaxVal {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 13, 4, 5 };
        // int n = arr.length;   //for optimal
        System.out.println("Largest value is : " + MaxValue(arr));

        // optimal solution
        // sort then length se minus
        // System.out.println("Maximum value is : " + arr[n- 1]);

    }
        //optimal soluation
        public static int MaxValue(int[] arr){
            int largest = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > largest){
                    largest = arr[i];
                }
            }
           return largest;
    }
}