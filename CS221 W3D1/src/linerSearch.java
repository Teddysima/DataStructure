
public class linerSearch {
	public static void main(String[] args) {
		int a[] = { 45, 66, 78, 9, 0, 01 };

		System.out.println("linear search  : ");
		if (LinearSearchLS(a, 12, 0)) {
			System.out.println("it is found ");
		} else
			System.out.println("not found");

	}

	public static boolean LinearSearchLS(int[] date, int searchKey, int index) {
		if (index == date.length - 1) {
			return false;
		}
		if (date[index] == searchKey) {
			return true;
		} else
			return LinearSearchLS(date, searchKey, ++index);

	}

}
