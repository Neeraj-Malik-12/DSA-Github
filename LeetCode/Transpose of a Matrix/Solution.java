class Solution {
    public int[][] transpose(int[][] arr) {
        int  rows = arr.length;
        int cols = arr[0].length;
        int[][] newArr = new int[cols][rows];
        for(int i = 0; i< arr.length ; i++){
            for( int j = 0 ; j< arr[0].length ; j++){
                newArr[j][i] = arr[i][j];
            }
        }
        return newArr;
    }
}