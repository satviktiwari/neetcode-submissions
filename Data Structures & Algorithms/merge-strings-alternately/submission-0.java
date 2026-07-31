class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i = 0, j = 0;
        int n = word1.length(), m = word2.length();
        while(i < n && j < m){
            ans += word1.charAt(i);
            ans += word2.charAt(j);
            i++;
            j++;
        }
        if(i < n){
            for(int itr = i; itr < n; itr++){
                ans += word1.charAt(itr);
            }
        } else {
            for(int itr = j; itr < m; itr++){
                ans += word2.charAt(itr);
            }
        }
        return ans;
    }
}