

public class revisedPriorityQ {

	private int maxSize;
	private long[] queArray;
	private int nItems;

	public revisedPriorityQ(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}

	public void insert(long item) {
		int j;

		if (nItems == 0)
			queArray[nItems++] = item;
		else {
			for (j = nItems - 1; j >= 0; j--) {
				if (item < queArray[j])
					queArray[j + 1] = queArray[j];
				else

					break;
			}
			queArray[j + 1] = item;
			nItems++;
		}
	}

	public long remove() {
		long h = queArray[0];

		for (int i = 0; i < nItems - 1; i++)
			queArray[i] = queArray[i + 1];
		nItems--;
		return h;
	}

	public long peekMin() {
		return queArray[0];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

}
