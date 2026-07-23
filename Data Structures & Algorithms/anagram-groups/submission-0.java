class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<List<Integer>, List<String>> map = new LinkedHashMap<>();
        int n = strs.length;
        for(int i = 0; i < n; i++){
            String str = strs[i];
            List<Integer> freqList = calcFreqArray(str);
            if(map.containsKey(freqList)){
                List<String> temp = map.get(freqList);
                temp.add(str);
                map.put(freqList, temp);
            } else {
                List<String> dummy = new ArrayList<>();
                dummy.add(str);
                map.put(freqList, dummy);
            }
        }
        for(Map.Entry<List<Integer>, List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }

    public List<Integer> calcFreqArray(String s){
        List<Integer> list = new ArrayList<>(Collections.nCopies(26, 0));   
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            int freqIndex = ch - 'a';
            int freq = list.get(freqIndex);
            freq++;
            list.set(freqIndex, freq);
        }
        System.out.println(list);
        return list;
    }
}
