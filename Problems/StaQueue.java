import java.util.*;

public class StaQueue {
	
	static Stack stOne = new Stack();
	static Stack stTwo = new Stack();
	
	public static void enqueue(Object in){
		stOne.push(in);
	}
	
	public static Object dequeue(){
		if(stTwo.empty()){
			reverseSend(stOne, stTwo);
		}
		
		return stTwo.pop();
		//slow way
		/* reverseSend(stOne, stTwo);
		Object out = new Object();
		reverseSend(stTwo, stOne);
		
		return out; */
	}
	
	public static void reverseSend(Stack from, Stack to){
		while(!from.empty()){
			to.push(from.pop());
		}
	}
	
	public static void main(String[] args){
		enqueue("a");
		System.out.print(dequeue());
		enqueue("b");
		enqueue("c");
		System.out.print(dequeue());
		System.out.print(dequeue());
	}
	
}