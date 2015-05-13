


class Node {
	int id;
	String name;
	Node leftChild, rightChild;

	Node(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + ", " + name);
	}

	public String toString() {
		return name + " " + id;
	}

}

class NodeOpr {
	Node root;

	NodeOpr() {
		root = null;
	}

	public boolean find(int key) 
	{ 
		Node current = root; 
		while (current.id != key)
		{
			if (key < current.id)
				current = current.leftChild;
			else
				
				current = current.rightChild;
			if (current == null) 
				return false; 
		}
		return true; 
	} 

	public void insert(int x, String n) {
		Node newNode = new Node(x, n);

		if (root == null)
			root = newNode;
		else 
		{
			Node current = root; 
			Node parent;
			while (true) 
			{
				parent = current;
				if (newNode.id < current.id) 
				{
					current = current.leftChild;
					if (current == null) 
					{ 
						parent.leftChild = newNode;
						return;
					}
				} 
				else 
				{
					current = current.rightChild;
					if (current == null) 
					{
						parent.rightChild = newNode;
						return;
					}
				} 
			}
		} 
	} 

	
	void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.println(localRoot.id + " , " + localRoot.name);
			inOrder(localRoot.rightChild);
		}
	}

	public void postOrderTraverseTree(Node localRoot) {

		if (localRoot != null) {

			postOrderTraverseTree(localRoot.leftChild);

			postOrderTraverseTree(localRoot.rightChild);

			System.out.println(localRoot.id + "," + localRoot.name);

		}

	}

	public int countleaf(Node localRoot) {

		if (localRoot != null) {
			if (localRoot.leftChild == null && localRoot.rightChild == null)
				return 1;
			else
				return countleaf(localRoot.leftChild)
						+ countleaf(localRoot.rightChild);

		}

		return 0;
	}

	public Node minimum() {
		Node current, last = null;
		current = root;
		while (current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}

	public Node maximum() {
		Node current, last = null;
		current = root;
		while (current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}

	Node getRoot() {
		return root;
	}
}