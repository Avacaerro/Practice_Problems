class Node<V> {
	
	public V data;
	public Node<V> next;
	
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
	
}