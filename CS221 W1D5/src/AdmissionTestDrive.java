import java.util.LinkedList;
import java.util.Queue;


public class AdmissionTestDrive {
	
	public static void main (String args[]){
		
		Queue<Admission> queue = new LinkedList<Admission>();
		
		String names [] = {"Teddy", "Simon", "Dani", "Menna", "Zeray"};
		String numbers [] = {"12", "13", "14", "15", "16"};
		
		
		for (int i = 0; i < 5; i++){
			queue.add(new Admission(i + 1, names[i], numbers[i]));
		}
		
		
		
		System.out.println("The peek element is: " + queue.peek());
		System.out.println("The size of the queue is: " + queue.size());
		
		System.out.println("contents of the queue are: ");
		
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
		System.out.println("cheking the queue is empty or not :" + queue.isEmpty());
		
		
		
	}

}
/*output
 * The peek element is: 1 Teddy 12
The size of the queue is: 5
contents of the queue are: 
1 Teddy 12
2 Simon 13
3 Dani 14
4 Menna 15
5 Zeray 16
cheking the queue is empty or not :true
 */
