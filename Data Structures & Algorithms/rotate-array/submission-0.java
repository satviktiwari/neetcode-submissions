class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int [] ans = new int[n];
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int new_i = (i+k)%n;
            ans[new_i] = num;
        }
        for(int i = 0; i < n; i++){
            nums[i] = ans[i];
        }
    }
}