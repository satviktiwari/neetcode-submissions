class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < tokens.length; i++){
            String s = tokens[i];
            if(s.equalsIgnoreCase("+")){
                int a = stack.pop();
                int b = stack.pop();
                int c = a+b;
                stack.push(c);
            } else if(s.equalsIgnoreCase("-")){
                int a = stack.pop();
                int b = stack.pop();
                int c = b-a;
                stack.push(c);
            } else if(s.equalsIgnoreCase("*")){
                int a = stack.pop();
                int b = stack.pop();
                int c = a*b;
                stack.push(c);
            } else if(s.equalsIgnoreCase("/")){
                int a = stack.pop();
                int b = stack.pop();
                int c = b/a;
                stack.push(c);
            } else {
                int c = Integer.parseInt(s);
                stack.push(c);
            }
        }
        return stack.pop();
    }
}
