
public class StringLinkedListTestDrive {

	public static void main(String[] args) {
		try {
			StringLinkedList list = new StringLinkedList();
		
			list.addFront("Teddy");
			list.addFront("Simon");
			list.addFront("Dani");
			list.addLast("Addisu");
			list.postAddNode("Teddy", "Menna");
			list.postAddNode("Addisu", "Zeray");
			list.postAddNode("Dani", "Bruk");
			list.preAddNode("Dani", "Rechie");
			list.preAddNode("Zeray", "Ghirma");
			list.preAddNode("Teddy", "Stella");
			
			list.printReverse();
			
			System.out.println("Find Teddy : " + list.findItem("Teddy"));
			System.out.println("Find Challa : " + list.findItem("Challa"));
			System.out.println("Find Last: " + list.findLast());
			
			list.deleteLast();
			
			list.printReverse();
			System.out.println("Find Last: " + list.findLast());
			
			list.deleteNode("Simon");
			
			list.printReverse();
			
			
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
/*output
 * Zeray
Ghirma
Addisu
Menna
Teddy
Stella
Simon
Bruk
Dani
Rechie
Find Teddy : Teddy
Find Challa : null
Find Last: Zeray
Ghirma
Addisu
Menna
Teddy
Stella
Simon
Bruk
Dani
Rechie
Find Last: Ghirma
Ghirma
Addisu
Menna
Teddy
Stella
Bruk
Dani
Rechie*/
