package arrays_basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        //Array creation:
        int[] arr = new int[size]; // n = size from user

        //input from the user:
        System.out.print("Enter the numbers to the array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        //output from the user:
        System.out.print("The elements in the array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Would like to update any element? IF YES, press 1. Else press 2. \n1. YES 2.NO");
        int choice = sc.nextInt();
        if(choice == 1) {
            //update position:
            System.out.println("Enter the position to update: ");
            int pos = sc.nextInt();
            if(pos < size){
                System.out.print("Enter the element to be updated in that position: ");
                int ele = sc.nextInt();
                arr[pos] = ele;
                System.out.print("Updated array: ");
                System.out.print(Arrays.toString(arr));
            }
            else{
                System.out.println("Your position to update the value is wrong. The size is "+ size+".");
            }
        }
        else {
            System.out.println("BYE!");
        }
    }
}
