public class MyBST {
	Node root;
	
	public void addNode(int key, int data){
		Node newNode = new Node(key, data);
		if(root == null){
			root = newNode;
		} else {
			Node parent = root;
			while(true){
				if(newNode.key < parent.key){
					if(parent.leftChild == null){
						parent.leftChild = newNode;
						System.out.println("Going in left " + parent.leftChild);
						return;
					}
					parent = parent.leftChild;
				} else {
					if(parent.rightChild == null){
						parent.rightChild = newNode;
						System.out.println("Going in right " + parent.rightChild);
						return;
					}
					parent = parent.rightChild;
				}
			}
		}
	}
	
	// searching until the key value is found
	public Node search(int key){
		Node current = root;
		while(key != current.key){
			if(key < current.key){
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if(current == null){
				return null;
			}
		}
		return current;
	}
	
	// recursively get the height of the BST
	public int getHeight(Node node){
		if(node == null){
			return -1; // nulls have a height of -1
		}
		int leftH = getHeight(node.leftChild);
		int rightH = getHeight(node.rightChild);
		if(leftH > rightH){
			return leftH + 1; // needs to be +1 so that root starts at height 0
		}
		return rightH + 1;
	}
	
	public int countNodes(Node node){
		if(node == null) {
			return 0;
		}
		int countL = countNodes(node.leftChild);
		int countR = countNodes(node.rightChild);
		return countL+countR+1;
	}
	
	
	public static void main(String[] args){
		MyBST tree = new MyBST();
		tree.addNode(25, 25);
		tree.addNode(15, 15);
		tree.addNode(12, 12);
		tree.addNode(65, 65);
		tree.addNode(35, 35);
		tree.addNode(5, 5);
		tree.addNode(6, 6);
		System.out.println("Height of " + tree.getHeight(tree.root));
		System.out.println("Searched and found " + tree.search(65));
		System.out.println("Count: " + tree.countNodes(tree.root));
	}

}

class Node {
	int key, data;
	Node leftChild, rightChild;
	
	Node(int key, int data){
		this.key = key;
		this.data = data;
	}
	
	public String toString(){
		return "Node " + key;
	}
}