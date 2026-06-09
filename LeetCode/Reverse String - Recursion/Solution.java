class Solution {
    int i = 0;
    public void reverseString(char[] s) {
        if( i >= (s.length / 2) ) return;
        char swap = s[i];
        s[i] = s[s.length - 1 - i];
        s[s.length - 1 - i] = swap;
        i++;
        reverseString(s);
    }
}