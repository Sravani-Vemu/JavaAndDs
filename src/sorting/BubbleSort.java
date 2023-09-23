package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSortAsc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSortDesc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
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
        System.out.println("Original array: "+ Arrays.toString(arr));

        //asking for choice => ascending order or descending order
        System.out.println("How would you like to arrange this array?\n1. Ascending order\n2. Descending order");
        int choice = sc.nextInt();
        if(choice == 1){
            bubbleSortAsc(arr);
        }
        else{
            bubbleSortDesc(arr);
        }
    }
}
