class containsCycleTest {
	
	public static void main(String[] args){
		Node A = new Node();
		Node B = new Node();
		Node C = new Node();
		Node D = new Node();
		Node E = new Node();
		
		A.data = 'a';
		B.data = 'b';
		C.data = 'c';
		D.data = 'd';
		E.data = 'e';
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = C;
		
		System.out.print(A.containsCycle());
		
	}
	
	
}