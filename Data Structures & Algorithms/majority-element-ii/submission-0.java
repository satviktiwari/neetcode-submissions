class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                int n = map.get(num);
                n += 1;
                map.put(num, n);
            } else{
                map.put(num, 1);
            }
        }
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int m = entry.getValue();
            if(m > n/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}