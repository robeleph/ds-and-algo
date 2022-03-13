class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(Character ch : s.toCharArray()) {
            if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '(') {
                stack.push(')');
            } else {
                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
