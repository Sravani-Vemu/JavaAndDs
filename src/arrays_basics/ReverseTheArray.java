package arrays_basics;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArray {
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
        System.out.println("Original array: "+Arrays.toString(arr));
        int i=0,j=size-1;
        while(i<=j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++;
            j--;
        }

        //print the array
        System.out.println("Reversed array: "+ Arrays.toString(arr));
    }
}
