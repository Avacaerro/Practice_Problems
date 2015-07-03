class Node<V> {
	
	public V data;
	public Node<V> next;
	
	// reversing the linked list
	public Node<V> reverseList(){
		Node<V> current = this;
		Node<V> left = null;
		Node<V> right = current.next;
		
		while(current != null){
			right = current.next;
			current.next = left;
			left = current;
			current = right;	
		}
		return left;
	}
	
	// checking if the list has a cycle
	public boolean containsCycle(){
		Node<V> first = this;
		Node<V> second = this;
		
		while(second != null && second.next != null){
			first = first.next;
			second = second.next;
			second = second.next;
			if(first == second){
				return true;
			}
		}
		return false;
	}
}