package Others.KthMinimumBrute;

import Others.PrintArray;
import Others.SelectionSort2;

import java.util.Scanner;

class Solution extends PrintArray {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        for(int i = 0 ; i < k ; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j = i ; j < arr.length ; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }                                  // these two for loops will sort the array till kth smallest
        return arr[k-1];
    }

    public static void main(String[] args) {
        int k = 4;
        Solution s = new Solution();
        int[] arrayOne = {1,5,2,3,8,4,10};
        s.print(arrayOne);                              // print the array
        int num = s.kthSmallest(arrayOne, k);
        System.out.println(k + "th smallest is : " + num);
    }


}

