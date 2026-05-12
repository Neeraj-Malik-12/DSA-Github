class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int index = -1;
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if( arr[mid] > k) high = mid -1;
            else if( arr[mid] < k) low = mid +1;
            else{
                index = mid;
                high = mid - 1;    // goes for checking again
            }
        }
        return index;     // if element not present then the else part will never get executed and index will remain -1.
    }
}