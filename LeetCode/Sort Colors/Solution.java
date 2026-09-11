class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i] , 0) + 1);
        }

        int zeros = freq.getOrDefault(0, 0);
        int ones = freq.getOrDefault(1, 0);
        int twos = freq.getOrDefault(2, 0);

        for(int i = 0 ; i < (zeros + ones + twos) ; i++){
            if(i < zeros){
                nums[i] = 0;
            }

            else if( i < (zeros + ones)){
                nums[i] = 1;
            }

            else{
                nums[i] = 2;
            }

        }
    }
}



OR



class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i] , 0) + 1);
        }

        int zeros = freq.getOrDefault(0, 0);
        int ones = freq.getOrDefault(1, 0);
        int twos = freq.getOrDefault(2, 0);

        for(int i = 0 ; i < zeros ; i++){
            nums[i] = 0;
        }

        for(int i = zeros ; i < (zeros + ones) ; i++){
            nums[i] = 1;
        }

        for(int i = (zeros + ones) ; i < (zeros + ones + twos) ; i++){
            nums[i] = 2;
        }
    }
}