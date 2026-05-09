class Solution {
    void selectionSort(int[] arr) {
        // code here
        for( int i = 0 ; i < arr.length -1 ; i++){
            int min = Integer.MAX_VALUE;  // provides the maximum possible value of int
            int mindex = -1;              // assume it -1 , later it will be change automatically
            for( int j = i ; j < arr.length ; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[mindex];
            arr[mindex] = arr[i];
            arr[i] = temp;
        }
    }
}