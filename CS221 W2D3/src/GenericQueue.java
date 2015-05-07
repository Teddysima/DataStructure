

public class GenericQueue<D> {
	private int maxSize;
	private D[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public GenericQueue(int s) {
		maxSize = s;
		queArray = (D[]) new Object[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(D j) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queArray[++rear] = j;
		nItems++;
	}

	public D remove() {
		D temp = queArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	public D peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int size() {
		return nItems;
	}

	public void display() {
		StringBuilder bd = new StringBuilder("[");
		for (int i = 0; i < nItems; i++) {
			bd.append(",").append(queArray[i]);
		}
		bd.append("]");
		System.out.println(bd.toString());

	}

}
