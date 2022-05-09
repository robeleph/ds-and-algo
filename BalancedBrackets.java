import java.util.*;

class BalancedBrackets {
  public static boolean balancedBrackets(String str) {
		String openingBrackets = "({[";
		String closingBrackets = ")}]";
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
    Stack<Character> stack = new Stack<Character>();
		for(char c : str.toCharArray()){
			if(openingBrackets.indexOf(c) != -1){
				stack.push(c);
			}else if(closingBrackets.indexOf(c) != -1){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.peek() == map.get(c)){
					stack.pop();
				}else{
					return false;
				}
			}
		}
    return stack.isEmpty();
  }
}
