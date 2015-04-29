
public class StringArrayOperationTestDrive {
	
	public static void main(String args[]) {

		StringArrayOperation sa = new StringArrayOperation();

		sa.insert("dani");
		sa.insert("Teddy");
		sa.insert("simon");
		sa.insert("selam");
		System.out.println(sa.size());
		sa.insert("zeray");
		System.out.println(sa.size());
		sa.insert("azeb");

		sa.display();

		try {
			System.out.println(sa.get(20));
		} catch (Exception e) {

		}

		sa.insertString("addis", 2);

		sa.display();

		sa.delete(0);

		sa.display();

		System.out.println(sa.find("Teddy"));
	}
}
/*output
4
resizing
5
----------
| 0 | dani |
----------
| 1 | Teddy |
----------
| 2 | simon |
----------
| 3 | selam |
----------
| 4 | zeray |
----------
| 5 | azeb |
----------
----------
| 0 | dani |
----------
| 1 | Teddy |
----------
| 2 | addis |
----------
| 3 | simon |
----------
| 4 | selam |
----------
| 5 | zeray |
----------
| 6 | azeb |
----------
----------
| 0 | Teddy |
----------
| 1 | addis |
----------
| 2 | simon |
----------
| 3 | selam |
----------
| 4 | zeray |
----------
| 5 | azeb |
----------
true*/