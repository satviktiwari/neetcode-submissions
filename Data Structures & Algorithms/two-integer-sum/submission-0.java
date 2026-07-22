class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int n = nums.length;
        int [] ans = new int[2];
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                ans[1] = i;
                ans[0] = map.get(diff);
            }
            else {
                map.put(num, i);
            }
        }
        return ans;
    }
}
