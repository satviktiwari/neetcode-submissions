class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1){
            return false;
        }
        HashSet<Integer> set = new LinkedHashSet();
        for(int i = 0; i < n; i++){
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}