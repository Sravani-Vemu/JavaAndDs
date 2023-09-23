package arrays_basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PairsInArray {
    public static void pairsInArray(int[] arr){
        int i,j,count=0;
        System.out.println("The following pairs are possible for the array "+ Arrays.toString(arr));
        for(i=0; i<arr.length-1; i++){
            for(j=i+1; j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs:"+count);
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

        pairsInArray(arr);
    }
}
