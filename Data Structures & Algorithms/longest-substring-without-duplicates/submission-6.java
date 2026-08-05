class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<String>test = new ArrayList<>();
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++){
            Set<Character> st = new LinkedHashSet<>();
            for(int j = i; j < n; j++){
                char ch = s.charAt(j);
                if(st.contains(ch)){
                    break;
                } else {
                    st.add(ch);
                    ans = Math.max(ans, st.size());
                }
            }
        }
        return ans;
        
    }
}
