
public class PriorityLinkedListTestDrive {

	public static void main(String[] args) {
		try {
			PriorityLinkedList queue = new PriorityLinkedList();
			
			queue.insert(25);
			queue.insert(10);
			queue.insert(35);
			queue.insert(5);
			queue.insert(50);
			queue.insert(30);
			
			System.out.println(queue);
			
			System.out.println("Remove: " + queue.remove());
			
			System.out.println(queue);
			
			System.out.println("Pick: " + queue.pick());
			
			while(!queue.isEmpty())
				System.out.println(queue.remove());
			
			System.out.println("isEmpty: " + queue.isEmpty());
									
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
/*output
 * [5, 10, 25, 30, 35, 50]
Remove: 5
[10, 25, 30, 35, 50]
Pick: 10
10
25
30
35
50
isEmpty: true*/
