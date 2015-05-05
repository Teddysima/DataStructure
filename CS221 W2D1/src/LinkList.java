


public class LinkList {
	private Link head;	
	private int size;

	public LinkList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void insertFirst(int data) {
		Link newLink = new Link(data);
		newLink.next = head;
		head = newLink;
		size++;
	}

	public int deleteFirst() {
		Link temp = head;
		head = head.next;
		size--;
		return temp.data;
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = head;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	public int size() {
	    return size;
	}
	
	public boolean find(int data){
		for (Link link = head; link != null; link = link.next){
			if (link.data == data)
				return true;
		}
		return false;
	}
	public int max() throws Exception{
		if(isEmpty()){
			throw new Exception("List is empty");
		}
		int max = head.data;
		for (Link link = head.next; link != null; link = link.next){
			if(link.data > max )
				max = link.data;
		}
		return max;
		
	}
	public int min() throws Exception{
		if(isEmpty()){
			throw new Exception("List is empty");
		}
		int min = head.data;
		for (Link link = head.next; link != null; link = link.next){
			if(link.data < min )
				min = link.data;
		}
		return min;
		
	}
	

}
