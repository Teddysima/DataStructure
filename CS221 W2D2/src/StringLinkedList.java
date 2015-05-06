public class StringLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public StringLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public void addFront(String item) {
		Node newNode = new Node(item);

		if (isEmpty())
			head = tail = newNode;
		else{
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	public void addLast(String item) {

		Node newNode = new Node(item);

		if (isEmpty())
			head = tail = newNode;
		else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}		
		size++;
	}

	public void postAddNode(String prevValue, String nextValue) throws Exception {
		Node prevNode = null;
		
		for(prevNode = head; prevNode != null; prevNode = prevNode.next){
			if(prevValue.equals(prevNode.value))
				break;
		}
		
		if(prevNode == null)
			throw new Exception("Value not found: " + prevValue);
		
		Node newNode = new Node(nextValue);
		
		if (prevNode.next != null){
			newNode.next = prevNode.next;
			newNode.previous = prevNode;
			prevNode.next.previous = newNode;
			prevNode.next = newNode;
		} else {
			prevNode.next = newNode;
			newNode.previous = prevNode;
			tail = newNode;
		}
		
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;

	}

	public void preAddNode(String nextValue, String prevValue) throws Exception {
		Node nextNode;
		
		for(nextNode = head; nextNode != null; nextNode = nextNode.next){
			if(nextValue.equals(nextNode.value))
				break;
		}
		
		if(nextNode == null)
			throw new Exception("Value not found: " + nextValue);				
		
		Node newNode = new Node(prevValue);
		
		if (nextNode.previous != null){
			newNode.next = nextNode;
			newNode.previous = nextNode.previous;
			nextNode.previous.next = newNode;
			nextNode.previous = newNode;
		} else {
			nextNode.previous = newNode;
			newNode.next = nextNode;
			head = newNode;
		}
				
		size++;
	}

	public Node findLast() {		
		return tail;
	}

	public Node findItem(String value) {
		Node node = null;
		
		for(node = head; node != null; node = node.next){
			if(value.equals(node.value))
				break;
		}		
		
		return node;
	}

	public void deleteNode(String value) {
		Node node = null;
		
		for(node = head; node != null; node = node.next){
			if(value.equals(node.value))
				break;
		}	
		
		if(node != null){
			if(node == head){
				head = head.next;
				if(head != null){
					head.previous = null;
				} else {
					tail = null;
				}
				
			} else if(node == tail){
				tail = tail.previous;
				if(tail != null){
					tail.next = null;
				} else {
					head = null;
				}
			} else {
				node.previous.next = node.next;
				node.next.previous = node.previous;
			}
			
			size--;
		}
	}

	public void deleteLast() {
		if(tail != head){	
			tail = tail.previous;
			tail.next = null;
			size--;
		} else if(tail != null){
			head = tail = null;
			size--;
		}		
	}

	public void printReverse() {
		for(Node n = tail; n != null; n = n.previous){
			System.out.println(n.value);
		}
	}

	class Node {

		public String value;
		public Node next;
		public Node previous;

		public Node(String value) {
			this.value = value;
			this.next = null;
			this.previous = null;
		}

		public String toString() {
			return value;
		}
	}
}
