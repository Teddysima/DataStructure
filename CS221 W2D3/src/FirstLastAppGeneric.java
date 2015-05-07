
class FirstLastAppGeneric {
	public static void main(String[] args) {
		FirstLastList<Integer> theList = new FirstLastList<Integer>();

		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);

		theList.insertLast(11); 
		theList.insertLast(33);
		theList.insertLast(55);

		theList.displayList(); 
		theList.deleteFirst(); 
		theList.displayList(); 

		FirstLastList<String> theList2 = new FirstLastList<String>();
		theList2.insertFirst("Simon"); 
		theList2.insertFirst("Teddy");
		theList2.insertFirst("mena");

		theList2.insertLast("Abs"); 
		theList2.insertLast("Book");
		theList2.insertLast("Cat");

		theList2.displayList(); 
		theList2.deleteFirst(); 
		theList2.displayList(); 

	} 
} 
/*output
 * List (first-->last): 66 44 22 11 33 55 
List (first-->last): 44 22 11 33 55 
List (first-->last): mena Teddy Simon Abs Book Cat 
List (first-->last): Teddy Simon Abs Book Cat 
 */

