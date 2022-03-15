class MakeValidParenthesis {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    set.add(i);
                }else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            set.add(stack.pop());
        }
        for (int k = 0; k < s.length(); k++) {
            if (!set.contains(k)) {
                result.append(s.charAt(k));
            }
        }
        return result.toString();
    }
}
