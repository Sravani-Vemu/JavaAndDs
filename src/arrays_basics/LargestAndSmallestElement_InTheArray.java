package arrays_basics;

import java.util.Scanner;

public class LargestAndSmallestElement_InTheArray {
    public static int largestInArray(int[] arr){
        int max = Integer.MIN_VALUE;    //-INFINITY
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int smallestInArray(int[] arr){
        int min = Integer.MAX_VALUE; //+infinity
        for (int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        //creating array
        int[] arr = new int[size];

        //enter the elements in the array.
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max_value = largestInArray(arr);
        int min_value = smallestInArray(arr);
        System.out.println("The largest element in the array is: "+max_value);
        System.out.println("The smallest element in the array is: "+min_value);
    }
}
