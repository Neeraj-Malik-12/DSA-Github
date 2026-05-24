class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 0;
        int j = 0;
        while( j < arr.length-1){
            if(arr[j] == arr[j+1]){
                j++;
            }

            else{
                j++;
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;
    }
}