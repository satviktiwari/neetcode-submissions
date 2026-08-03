class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "", s2 = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                s1 += ch;
            }
        }
        for(int j = s1.length()-1; j >= 0; j--){
            char ch = s1.charAt(j);
            s2 += ch;
        }
        if(s1.equalsIgnoreCase(s2)){
            return true;
        }
        return false;
    }
}
