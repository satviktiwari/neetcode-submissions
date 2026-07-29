class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> temp = new ArrayList<>();
        for(int n : nums){
            if(n == val){
                continue;
            } else{
                temp.add(n);
            }
        }
        for(int i = 0; i < temp.size(); i++){
            nums[i] = temp.get(i);
        }
        return temp.size();
    }
}