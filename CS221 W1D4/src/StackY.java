
class StackY {
	private int maxSize;
	private long[] stackArray;
	private int top;

	public StackY(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	public void push(long j) {
		if (!isFull())
			stackArray[++top] = j;
		else
			System.out.println("Can’t insert, stack is full");

	}

	public long pop() {
		if (!isEmpty())
			return stackArray[top--];
		else
			System.out.println("Can’t Delete, stack is empty");
		return 0;

	}

	public long peek() {
		return stackArray[top];
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

	public int size() {
		return top + 1;
	}

	public boolean isElement(long x) {
		for (int i = 0; i < maxSize; i++) {
			if (stackArray[i] == x)
				break;
			if (i == top)
				return false;
		}
		return true;

	}
	public void clear(){
		while(!isEmpty()){
			pop();
			
		}
	}


}
