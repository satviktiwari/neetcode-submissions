class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new LinkedHashMap<>();
        Map<Character, Integer> mapT = new LinkedHashMap<>();

        int n = s.length();
        int m = t.length();

        if(n != m){
            return false;
        }

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(null != mapS.get(ch)){
                int countOfChar = mapS.get(ch);
                countOfChar++;
                mapS.put(ch, countOfChar);
            } else {
                mapS.put(ch, 1);
            }
        }

        for(int i = 0; i < m; i++){
            char ch = t.charAt(i);
            if(null != mapT.get(ch)){
                int countOfChar = mapT.get(ch);
                countOfChar++;
                mapT.put(ch, countOfChar);
            } else {
                mapT.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : mapS.entrySet()){
            char chS = entry.getKey();
            int countS = entry.getValue();

            if(null == mapT.get(chS)){
                return false;
            }
            int countT = mapT.get(chS);

            if(countS != countT) {
                return false;
            }
        }

        return true;
    }
}
