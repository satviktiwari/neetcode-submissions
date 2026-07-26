class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                int m = map.get(n);
                m++;
                map.put(n, m);
            } else{
                map.put(n, 1);
            }
        }
        Map<Integer, Integer> sorted = map.entrySet().stream()
    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
    .collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue,
        (e1, e2) -> e1,
        LinkedHashMap::new
    ));
        int[] ans = new int[k];
        int idx = 0;
        for(Map.Entry<Integer, Integer> e : sorted.entrySet()){
            ans[idx++] = e.getKey();
            if (idx == k) break;
        }
        return ans;
    }
}
