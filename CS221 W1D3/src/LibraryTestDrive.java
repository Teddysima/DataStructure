import java.util.ArrayList;


public class LibraryTestDrive {
	
	public static void main (String args[]){
		
		ArrayList<Library> lib = new ArrayList<Library>();
		
		System.out.println("Initial size of al: " + lib.size());
		
		lib.add(new Library(1234, "nice", "math",12.56));
		lib.add(new Library(1234, "one", "english",12.56));
		lib.add(new Library(1234, "two", "chemistry",12.56));
		lib.add(new Library(1234, "three", "biology",12.56));
		lib.add(new Library(1234, "four", "math",12.56));
		
		System.out.println("Size of al after additions: " + lib.size());
		System.out.println("Contents of Library: " + lib);
		
		lib.remove(1);
		
		System.out.println("Size of al after deletion: " + lib.size());
		
		System.out.println(lib.isEmpty());
		
		Library obj = lib.get(1);
		System.out.println(obj);
		
		double total = 0;
		for (Library l : lib){
			if(l.getBookName().equals("math")){
				total += l.getPrice();				
			}
		}
		System.out.println("Total selleing price of book : $" + total);	
		
	}

}
/* output
 * Initial size of al: 0
Size of al after additions: 5
Contents of Library: [math 12.56, english 12.56, chemistry 12.56, biology 12.56, math 12.56]
Size of al after deletion: 4
false
chemistry 12.56
Total selleing price of book : $25.12*/
