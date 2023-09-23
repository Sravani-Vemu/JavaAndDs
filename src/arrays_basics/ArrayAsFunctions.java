package arrays_basics;

import java.util.Arrays;

public class ArrayAsFunctions {

    //ARRAYS are sent to the function by the reference.
    public static void update(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+1;
        }
        System.out.println("Array updated with 1 for each element.");
        System.out.println("New Updated Array : "+ Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Array : "+ Arrays.toString(arr));
        update(arr);
    }
}
