package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchCode {
    public static int binarySearch(int[] arr,int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] < key){
                start = mid+1;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                return mid;
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
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
        int res = binarySearch(arr,key);
        if(res == -1){
            System.out.println("Element not found :(");
        }
        else{
            System.out.println("Element found at "+res+" or at position "+(res+1));
        }
    }
}
