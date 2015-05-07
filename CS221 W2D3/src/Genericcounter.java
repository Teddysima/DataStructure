

public class Genericcounter {

	private int amount[];
	private int max;
	private int nElem;

	public Genericcounter(int x) {
		max = x;
		amount = new int[max];
		nElem = 0;

	}

	public void insert(int y) {
		if (nElem < max) {
			amount[nElem] = y;
			nElem++;
		} else {
			System.out.println("it is full :");
		}

	}

	public int countOccurance() {

		int counter = 1;

		for (int j = 0; j < amount.length; j++)
			for (int k = j + 1; k < amount.length; k++)
				if (k != j && amount[k] == amount[j])
					// duplicates=true;
					counter++;

		return counter;
	}

	public void display() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < nElem; i++) {
			sb.append(amount[i] + ",");
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
