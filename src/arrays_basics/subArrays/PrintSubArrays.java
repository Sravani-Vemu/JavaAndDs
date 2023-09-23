package arrays_basics.subArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintSubArrays {
    public static void printSubArrays(int[] arr){
        int i,j,start,end,k;
        for(i=0;i<arr.length;i++){
            start = i;
            System.out.println(arr[i]);
            for(j=i+1;j<arr.length;j++) {
                end = j;
                for (k = start; k <= end; k++) {
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }

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

        printSubArrays(arr);
    }
}
