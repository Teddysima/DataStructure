

class LinkList1Generic<D> {
	class Link {
		public D dData;
		public Link next;

		public Link(D dd) {
			dData = dd;
		}

		public void displayLink() {
			System.out.print(dData + " ");
		}
	}

	private Link first;

	public LinkList1Generic() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(D dd) {
		Link newLink = new Link(dd);
		newLink.next = first;
		first = newLink;
	}

	public D deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp.dData;
	}

	public void displayList() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}

}
