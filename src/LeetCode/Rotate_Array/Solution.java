package LeetCode.Rotate_Array;

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        k = length-k;
        reverse(nums, 0, k-1);
        reverse(nums, k, length-1);
        reverse(nums, 0, length-1);
    }

    public void reverse( int[] arr, int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
