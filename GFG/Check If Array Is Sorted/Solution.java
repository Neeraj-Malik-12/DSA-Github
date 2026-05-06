class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        //a for loop to traverse the array " arr "
        for( int i = 0 ; i < arr.length -1 ; i++){
            // we will traverse only till second last element otherwise the condition "arr[i+1]" will show IndexOutOfBound error
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}