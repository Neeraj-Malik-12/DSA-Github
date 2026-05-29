class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        StringBuilder sb = new StringBuilder();
        int minLength = Math.min(s1.length() , s2.length());
        for(int i = 0 ; i < minLength ; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}