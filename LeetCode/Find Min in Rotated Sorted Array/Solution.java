class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int ans = -1;
        while( low <= high){
            int mid = low + ( high - low )/2;
            if(mid != 0 && mid != nums.length-1){
                if(nums[mid] < nums[mid-1] && nums[mid] < nums[mid+1]) return nums[mid];
            }
            if(nums[low] <= nums[high]) return nums[low];
            if( nums[low] <= nums[mid] ) low = mid+1;
            else high = mid-1;

            ans = nums[mid];
        }
        return ans;
    }
}