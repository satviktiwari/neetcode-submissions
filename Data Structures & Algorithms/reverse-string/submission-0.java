class Solution {
    public void reverseString(char[] s) {
        String ans = "";
        for(int i = s.length-1; i >= 0; i--){
            ans += s[i];
        }
        for(int i = 0; i < s.length; i++){
            s[i] = ans.charAt(i);
        }
    }
}