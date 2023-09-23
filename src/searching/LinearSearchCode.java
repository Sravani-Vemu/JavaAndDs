package searching;

import java.util.Scanner;

public class LinearSearchCode {
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
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

        //enter key
        System.out.print("Enter key: ");
        int key = sc.nextInt();

        int res = linearSearch(arr,key);
        if(res == -1){
            System.out.println("Element not found :(");
        }
        else{
            System.out.println("Element found at "+res+" or at position "+(res+1));
        }
    }
}
