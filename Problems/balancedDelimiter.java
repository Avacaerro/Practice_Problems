import java.util.*;

class balancedDelimiter {
	
	public boolean isBalanced(String deString){
		Map m1 = new HashMap();
		m1.put(')', '(');
		m1.put('}', '{');
		m1.put(']', '[');
		Stack balance = new Stack();
		for(char delim : deString.toCharArray()){
			if(m1.containsValue(delim)){
				balance.push(delim);
			}
			if(m1.containsKey(delim)){
				if(balance.peek() == m1.get(delim)){
					balance.pop();
				} else {
					return false;
				}
			}
		}
		return balance.empty();
	}
}