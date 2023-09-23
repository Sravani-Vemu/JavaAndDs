package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    /*process
    1. take for loop
    2. let the first position element be the minimum element.
    3. take the next for-loop that runs from j to arr.length-1
    4. check whether there is other element that is minimum
    */
    public static void selectionSortAsc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[minPos]>arr[j]){
                  minPos=j;
               }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array in ascending order:"+Arrays.toString(arr));
    }
    public static void selectionSortDesc(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int maxPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxPos]){
                    maxPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
        System.out.println("Array is descending order: "+Arrays.toString(arr));
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
        System.out.println("Original array: " + Arrays.toString(arr));

        //asking for choice => ascending order or descending order
        System.out.println("How would you like to arrange this array?\n1. Ascending order\n2. Descending order");
        int choice = sc.nextInt();
        if (choice == 1) {
            selectionSortAsc(arr);
        } else {
            selectionSortDesc(arr);
        }
    }
}
