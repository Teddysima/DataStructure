

class LinkStackGeneric<D> {
	private LinkList1Generic theList;

	public LinkStackGeneric() {
		theList = new LinkList1Generic();
	}

	public void push(D j) {
		theList.insertFirst(j);
	}

	public D pop() {
		if (!isEmpty()) {
			return (D) theList.deleteFirst();
		}
		return null;
	}

	public boolean isEmpty() {
		return (theList.isEmpty());
	}

	public void displayStack() {
		System.out.print("Stack (top-->bottom): ");
		theList.displayList();
	}

}
