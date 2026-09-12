class Solution {
    public int[] rearrangeArray(int[] nums) {

        int pos = 0;
        int neg = 1;

        int[] arr =  new int[nums.length];
        for( int i = 0 ; i < nums.length; i++){
            if(nums[i] > 0){
                arr[pos] = nums[i];
                pos += 2;
            }

            else{
                arr[neg] = nums[i];
                neg += 2;
            }
        }

        return arr;



        OR



        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();

        for(int i =  0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                posList.add(nums[i]);
            }

            else{
                negList.add(nums[i]);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < nums.length/2 ; i++){
            result.add(posList.get(i));
            result.add(negList.get(i));
        }

        for(  int i = 0 ; i < nums.length ; i++){
            nums[i] = result.get(i);
        }

        return nums;


    }
}