

class revisedPriorityTestDrive {

	public static void main(String[] args) {

		revisedPriorityQ thePQ = new revisedPriorityQ(5);

		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);

		while (!thePQ.isEmpty()) {
			long item = thePQ.remove();
			System.out.print(item + " ");
		}
		System.out.println("");
	}

}
/*output
10 20 30 40 50 */