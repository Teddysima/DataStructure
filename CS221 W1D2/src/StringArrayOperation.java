public class StringArrayOperation {

	private String[] strArray;
	private int arraySize;
	private final int INITAL_LENGTH = 4;

	public StringArrayOperation() {
		strArray = new String[INITAL_LENGTH];
		arraySize = 0;

	}

	public String[] getTheArray() {

		return strArray;

	}

	public int size() {

		return arraySize;

	}

	public boolean find(String name) {
		for (int i = 0; i < arraySize; i++) {
			if (strArray[i].equals(name))
				return true;

		}
		return false;
	}

	public String get(int pos) {
		if (pos < 0 || pos >= arraySize)
			throw new IndexOutOfBoundsException();

		return strArray[pos];
	}

	public void display() {

		System.out.println("----------");

		for (int i = 0; i < arraySize; i++) {

			System.out.print("| " + i + " | ");

			System.out.println(strArray[i] + " |");

			System.out.println("----------");

		}

	}

	public void insert(String name) {
		if (arraySize == strArray.length)
			resize();

		strArray[arraySize] = name;

		arraySize++;

	}

	public void delete(int index) {

		if (index < arraySize) {

			for (int i = index; i < (arraySize - 1); i++) {

				strArray[i] = strArray[i + 1];

			}

			arraySize--;
			strArray[arraySize] = null;

		}

	}

	public void insertString(String name, int pos) {
		if (pos > arraySize)
			return;
		if (arraySize == strArray.length)
			resize();

		for (int i = arraySize; i > pos; i--) {
			strArray[i] = strArray[i - 1];
		}
		strArray[pos] = name;
		arraySize++;

	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2 * len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray, 0, temp, 0, len);
		strArray = temp;
	}

}
