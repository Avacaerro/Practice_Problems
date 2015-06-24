import java.util.*;

class ReverseLLTest {
	
	
	
	public static void main(String[] args){
		Node one = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
		
		one.data = "a";
		two.data = "b";
		three.data = "c";
		four.data = "d";
		
		one.next = two;
		two.next = three;
		three.next = four;

		one.reverseList();
	}
	
	
	
}