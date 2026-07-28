class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(String str : strs){
            ans += str.length();
            ans += "#";
            ans += str;
        }
        return ans;
    }

    public List<String> decode(String str) {
        List<String>ans = new ArrayList<>();
        int itr = 0;
        int n = str.length();
        while(itr < n){
            int j = itr;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(itr,j));
            itr = j;
            if(itr < n && str.charAt(itr) == '#'){
                String temp = str.substring(itr+1, itr+len+1);
                ans.add(temp);
                itr += len+1;
            }
        }
        return ans;
    }
}
