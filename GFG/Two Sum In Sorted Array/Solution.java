class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int i = 0;
        int j = arr.length-1;
        ArrayList<Integer> al = new ArrayList<>();
        while(i<j){
            if((arr[i] + arr[j]) == target){
                al.add(i+1);
                al.add(j+1);
                return al;
            }
            else if((arr[i] + arr[j]) > target) j--;
            else if((arr[i] + arr[j]) < target) i++;
        }
        al.add(-1);
        al.add(-1);
        return al;
    }
}