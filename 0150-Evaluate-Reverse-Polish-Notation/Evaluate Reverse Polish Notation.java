class Solution {
    private static final Set<String> operators = Set.of("*", "+", "/", "-");
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if(operators.contains(token)){
                stack.push(performing(stack.pop(), stack.pop(), token));
            }
            else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
    
    private static int performing(int num1, int num2, String operator) throws UnsupportedOperationException{
        int res = 0;
        switch(operator){
            case "+": res = num1 + num2; break;
            case "-": res = num2 - num1; break;
            case "*": res = num1 * num2; break;
            case "/": res = num2 / num1; break;
            default: throw new UnsupportedOperationException("Operation not supported");
        }
        return res;
    }
}
