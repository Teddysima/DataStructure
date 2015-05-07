

public class GenericcounterTest {
	public static void main(String[] args) {
		Genericcounter obj = new Genericcounter(5);
		obj.insert(10);
		obj.insert(10);
		obj.insert(12);
		obj.insert(4);
		
		
		
		obj.display();

		System.out.println("The count of the same number is: " + obj.countOccurance());
	}
	

}
/*output
 * [10,10,12,4,]
The count of the same number is: 2
 */

