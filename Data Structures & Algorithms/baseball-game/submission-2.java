class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ans = 0;
        for(int i = 0; i < operations.length; i++){
            String s = operations[i];
            if(s.equalsIgnoreCase("+")){
                int a = stack.pop();
                int b = stack.pop();
                int c = a+b;
                stack.push(b);
                stack.push(a);
                stack.push(c);
            } else if(s.equalsIgnoreCase("C")){
                stack.pop();
            } else if(s.equalsIgnoreCase("D")){
                int a = stack.peek();
                int b = a*2;
                stack.push(b);
            } else {
                int num = Integer.parseInt(s);
                stack.push(num);
            }
        }
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    }
}