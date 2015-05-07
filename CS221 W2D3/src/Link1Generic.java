

public class Link1Generic<D> {
	public D dData;
	public Link1Generic next;

	public Link1Generic(D d) {
		dData = d;
	}

	public void displayLink() {
		System.out.print(dData + " ");
	}

}

class FirstLastList<D> {
	private Link1Generic first;
	private Link1Generic last;

	public FirstLastList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(D dd) {
		Link1Generic newLink = new Link1Generic(dd);

		if (isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(D dd) {
		Link1Generic newLink = new Link1Generic(dd);
		if (isEmpty())
			first = newLink;
		else
			last.next = newLink;
		last = newLink;
	}

	public D deleteFirst() {
		D temp = (D) first.dData;
		if (first.next == null)
			last = null;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link1Generic current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}

}
