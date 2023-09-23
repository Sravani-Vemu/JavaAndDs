package arrays_basics.subArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArraySum {
    public static int printMaxSubArraySum(int[] arr){   //2 3 4 5
        int max_sum=Integer.MIN_VALUE;
        int i,j,start,end,k,current_sum=0;
        for(i=0;i<arr.length;i++){
            start = i;
            current_sum = current_sum+arr[i]; //2
            if(current_sum>max_sum){
                max_sum = current_sum;
            }
            System.out.println(arr[i]+" Current sum =>"+current_sum);
            for(j=i+1;j<arr.length;j++){
                end = j;
                current_sum=0;
                for(k=start;k<=end;k++){
                    current_sum=current_sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println("Current sum =>"+current_sum);
                if(current_sum>max_sum){
                    max_sum=current_sum;
                }
            }
            System.out.println();
        }
        System.out.println("Returning maximum sum:"+max_sum);
        return max_sum;
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

        int max_sum = printMaxSubArraySum(arr);
        System.out.println("Maximum Sub array sum =>"+max_sum);
    }
}
