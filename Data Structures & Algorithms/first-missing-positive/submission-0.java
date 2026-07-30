class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer>st = new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i++){
            st.add(nums[i]);
        }
        int ans = 0;
        for(int i = 1; i <= Integer.MAX_VALUE; i++){
            if(st.contains(i) == false){
                ans = i;
                break;
            }
        }
        return ans;
    }
}