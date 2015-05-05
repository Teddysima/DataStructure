

public class LinkListApp {
	public static void main(String[] args) {
		
		try{
		LinkList theList = new LinkList();

		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);
		
		System.out.println("The List size is: " + theList.size());
		System.out.println("find exsiting number: " + theList.find(66));
		System.out.println("find none exsiting number: " + theList.find(100));
		
		System.out.println("The maximum element is: "+ theList.max());
		System.out.println("The minumem element is: " + theList.min());

		theList.displayList();

		while (!theList.isEmpty()) {
			int aLink = theList.deleteFirst();
			System.out.print("Deleted " + aLink);
			System.out.println("");
		}
		theList.displayList();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
/*output
 * The List size is: 4
find exsiting number: true
find none exsiting number: false
The maximum element is: 88
The minumem element is: 22
List (first-->last): {88} {66} {44} {22} 
Deleted 88
Deleted 66
Deleted 44
Deleted 22
List (first-->last):*/
