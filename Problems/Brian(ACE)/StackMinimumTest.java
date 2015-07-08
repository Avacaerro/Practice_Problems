import java.util.*;

class StackMinimumTest {
	
	public static void main(String[] args){
		StackMinimum findMin = new StackMinimum();
		Stack<Integer> input = new Stack<Integer>();
		input.push(3);
		input.push(1);
		input.push(6);
		input.push(5);
		System.out.print(findMin.getMinimum(input));
	}
}