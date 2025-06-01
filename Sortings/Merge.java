package Sortings;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int n = 7;
        int arr[] = {9, 4, 7, 6, 3, 1, 5};

        mergeSort(arr, 0, n -1);

        // for (int i = 0; i < n; i++) {
        //     System.out.println(arr[i]);
        // }
        System.out.println(Arrays.toString(arr));
        
    }
    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();   //temporary array
        int left = low;   //statring index of left half of arr
        int right = mid + 1; // starting index of right half of arr

        //Storing element in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;

            } else{
                temp.add(arr[right]);
                right++;
            }
        }

        //if elemnet on the left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

         //if elemnet on the right half are still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        //transfering all element from temporary to array 
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    public static void mergeSort(int[] arr, int low, int high){
            
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);  //left half
        mergeSort(arr, mid + 1, high);  //right half
        merge(arr, low, mid, high);   //merging sorted halves

        //TC - > O(nlogn)
        //SC -> O(n)
    }
}
