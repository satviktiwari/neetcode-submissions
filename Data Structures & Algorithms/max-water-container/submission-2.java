class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i <= j){
            ans = Math.max((j-i) * Math.min(heights[i], heights[j]), ans);
            if(heights[i] <= heights[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }
}
