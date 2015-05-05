
public class DirectoryTestDrive {

	public static void main(String[] args) {
		DirectoryOpr directoryOpr = new DirectoryOpr();
				
		directoryOpr.insertFirst("Teddy", 2404191534L);
		directoryOpr.insertFirst("Dani", 1234L);
		directoryOpr.insertFirst("Mennisho", 5678L);
		directoryOpr.insertFirst("Simon", 9876L);
		
		directoryOpr.displayList();
		System.out.println();
		
		directoryOpr.insertLast("Addisu", 1283L);
		
		directoryOpr.displayList();
		System.out.println();
		
		directoryOpr.deleteFirst();
		
		directoryOpr.displayList();
		System.out.println();
		
		System.out.println("The size of the list is: " + directoryOpr.size());
		
		System.out.println("exists(Simon) = " + directoryOpr.find("Simon"));
		System.out.println("exists(Teddy) = " + directoryOpr.find("Teddy"));
		

	}

}
/*output
 * Directory [Simon, 9876]
Directory [Mennisho, 5678]
Directory [Dani, 1234]
Directory [Teddy, 2404191534]

Directory [Simon, 9876]
Directory [Mennisho, 5678]
Directory [Dani, 1234]
Directory [Teddy, 2404191534]
Directory [Addisu, 1283]

Directory [Mennisho, 5678]
Directory [Dani, 1234]
Directory [Teddy, 2404191534]
Directory [Addisu, 1283]

The size of the list is: 4
exists(Simon) = null
exists(Teddy) = Directory [Teddy, 2404191534]
*/
