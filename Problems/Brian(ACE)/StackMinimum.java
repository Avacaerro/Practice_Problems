import java.util.*;

class StackMinimum {
	
	public int getMinimum(Stack inputStack){
		if (inputStack.empty){
			return 0;
		}
		Stack<Integer> inStack = inputStack;
		Stack<Integer> valueStack = new Stack<Integer>();
		valueStack.push(inStack.pop());
		int minimum = valueStack.peek();
		while(!inStack.empty()){
			valueStack.push(inStack.pop());
			if(valueStack.peek() <= minimum){
				minimum = valueStack.peek();
			}
		}
		return minimum;
	}
	
}