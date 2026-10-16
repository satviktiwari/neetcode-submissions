class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(' ){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char ch = stack.pop();
                char sch = s.charAt(i);
                if(sch == '}'){
                    if(ch != '{'){
                        return false;
                    }
                } else if(sch == ')'){
                    if(ch != '('){
                        return false;
                    }
                } else if(sch == ']'){
                    if(ch != '['){
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
