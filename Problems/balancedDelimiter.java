import java.util.*;

class balancedDelimiter {
	
	public boolean isBalanced(String deString){
		Map m1 = new HashMap();
		m1.put(')', '(');
		m1.put('}', '{');
		m1.put(']', '[');
		Stack balance = new Stack();
		for(char delim : deString.toCharArray()){
			if(delim == '(' || delim == '{' || delim == '['){
				balance.push(delim);
			}
			if(delim == ')' || delim == '}' || delim == ']'){
				if(balance.peek() == m1.get(delim)){
					balance.pop();
				} else {
					return false;
				}
			}
		}
		if(balance.empty()){
			return true;
		}
		return false;
	}
}