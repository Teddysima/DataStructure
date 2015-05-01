class stackTeddy {

	private int maxSize;
	private long[] stackArray;
	private int top;

	public stackTeddy(int max) {
		maxSize = max;
		stackArray = new long[maxSize];
		top = -1;
	}

	public void push(long j) throws Exception {
		if (!isFull()) {
			stackArray[++top] = j;
		} else {
			throw new Exception("stack is full.");
		}
	}

	public long pop() throws Exception {
		if (!isEmpty()) {
			return stackArray[top--];
		} else {
			throw new Exception("stack is empty.");
		}
	}

	public long peek() throws Exception {
		if (!isEmpty()) {
			return stackArray[top];
		} else {
			throw new Exception("stack is empty.");
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public String toString() {
		String out = "";
		for (int i = top; i >= 0; i--)
			out = out + stackArray[i] + " ";

		return "[ " + out + "]";
	}
}