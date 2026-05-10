package Others.TwoSumUsingSorting;

import Others.PrintArray;
import java.util.Arrays;

public class TwoSumUsingSort extends PrintArray {
    public int[] twoSumSort(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] + arr[j] == target) return new int[]{arr[i], arr[j]};
            else if(arr[i] + arr[j] > target) j--;
            else if( arr[i] + arr[j] < target) i++;
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] mainArray = {7,0,4,3,2,8,10};
        int[] operationArray = mainArray.clone();   // Concept of deep copy ( Changes in operationArray{sorting here} do NOT affect mainArray )
        int target = 9;
        int x = 0, y = 0;

        TwoSumUsingSort ts = new TwoSumUsingSort();
        ts.print(operationArray);

        int[] arr = ts.twoSumSort(operationArray, target);

        if(arr.length == 1) System.out.println("No pairs found.");
        else{
            System.out.println("Target sum is achieved.");
            System.out.print("Pairs are: ");
            ts.print(arr);
            for( int i = 0 ; i < mainArray.length ; i++){
                if(mainArray[i] == arr[0]){
                    x = i;
                }
                if(mainArray[i] == arr[1]){
                    y = i;
                }
            }
            System.out.println("The indices are : " + x + " " + y);
        }
    }
}

