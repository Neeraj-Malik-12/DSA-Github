class Solution {
    public String reverseWords(String s) {
        int i = s.length()-1;
        int j = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(j>=0){
            if(s.charAt(j) == ' '){
                if(sb.length() == 0){
                    sb.append(s.substring(j+1, i+1));
                }
                else if(sb.length() != 0 && i-j >0){
                    sb.append(" ");
                    sb.append(s.substring(j+1, i+1));
                }
                j = j-1;
                i = j;
            }

            else{
                j--;
            }
        }
        if(i-j>0){
            if(sb.length() != 0){
                sb.append(" ");
            }
            sb.append(s.substring(j+1, i+1));
        }
        return sb.toString();
    }
}