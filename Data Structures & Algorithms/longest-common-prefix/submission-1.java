class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String s = strs[0];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            for(int j = 1; j < strs.length; j++){
                String str = strs[j];
                if(str.length() <= i){
                    return ans;
                } else {
                    if(str.charAt(i) != ch){
                        return ans;
                    }
                }
            }
            ans += ch;
        }
        return ans;
    }
    
}