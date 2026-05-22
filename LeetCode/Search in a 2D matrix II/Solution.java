class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex + 1;
        List<List<Integer>> ls = new ArrayList<>();
        for( int i = 0 ; i < n ; i++){
            ls.add(new ArrayList<>());
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i) ls.get(i).add(1);
                else ls.get(i).add(ls.get(i-1).get(j) + ls.get(i-1).get(j-1));
            }
        }
        return ls.get(rowIndex);
    }
}
