
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HashTableApp {
	public static void main(String[] args) throws IOException {
		
	
		DataItem aDataItem;
		int aKey, size, n;
		
		System.out.print("Enter size of hash table: ");
		size = getInt();
		System.out.print("Enter initial number of items: ");
		n = getInt();
		
		
		HashTable theHashTable = new HashTable(size);

		for (int j = 0; j < n; j++) 
		{
			aKey = (int) (java.lang.Math.random() * 2 * size);
			aDataItem = new DataItem(aKey);
			theHashTable.insert(aKey,aDataItem);
		}

		while (true) 
		{
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, find or Size: ");
			char choice = getChar();
			switch (choice) {
			case 'S':
				System.out.println("The size of the hashTable: " + theHashTable.getSize());
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key value to insert: ");
				aKey = getInt();
				aDataItem = new DataItem(aKey);
				theHashTable.insert(aKey, aDataItem);

				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = getInt();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = getInt();
				aDataItem = theHashTable.find(aKey);
				if (aDataItem != null) {
					System.out.println("Found " + aKey);
				} else
					System.out.println("Could not find " + aKey);
				break;
			default:
				System.out.print("Invalid entry\n");
			} 
		} 
	} 

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
}
/*output
 * Enter size of hash table: 5
Enter initial number of items: 0
Enter first letter of show, insert, delete, find or Size: i
Enter key value to insert: 12
Enter first letter of show, insert, delete, find or Size: s
Table: ** ** 12 ** ** 
Enter first letter of show, insert, delete, find or Size: i
Enter key value to insert: 17
Enter first letter of show, insert, delete, find or Size: s
Table: 17 ** 12 ** ** 
Enter first letter of show, insert, delete, find or Size: i
Enter key value to insert: 22
Enter first letter of show, insert, delete, find or Size: s
Table: 17 ** 12 22 ** 
Enter first letter of show, insert, delete, find or Size: d
Enter key value to delete: 22
Enter first letter of show, insert, delete, find or Size: s
Table: 17 ** 12 -1 ** 
Enter first letter of show, insert, delete, find or Size: S
The size of the hashTable: 3
Table: 17 ** 12 -1 ** 
Enter first letter of show, insert, delete, find or Size: */
