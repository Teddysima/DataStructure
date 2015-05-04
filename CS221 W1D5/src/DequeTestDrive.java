
public class DequeTestDrive {

	public static void main(String[] args) {
		Deque deque = new Deque(10);
		
		try {
			System.out.println("insertLeft:");
			for(int i = 0; i < 5; i++){
				deque.insertLeft(i);
				System.out.println(i);
			}
			
			System.out.println("removeLeft");
			while(!deque.isEmpty()){
				System.out.println(deque.removeLeft());
			}
			
			System.out.println("insertRight:");
			for(int i = 0; i < 5; i++){
				deque.insertRight(i);
				System.out.println(i);
			}
			
			System.out.println("removeRight");
			while(!deque.isEmpty()){
				System.out.println(deque.removeRight());
			}
			
			System.out.println("insertLeft:");
			for(int i = 0; i < 5; i++){
				deque.insertLeft(i);
				System.out.println(i);
			}
			
			System.out.println("removeRight:");
			while(!deque.isEmpty()){
				System.out.println(deque.removeRight());
			}
			
			System.out.println("insertRight:");
			for(int i = 0; i < 5; i++){
				deque.insertRight(i);
				System.out.println(i);
			}
			
			System.out.println("removeLeft:");
			while(!deque.isEmpty()){
				System.out.println(deque.removeLeft());
			}			
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
/*output
 * insertLeft:
0
1
2
3
4
removeLeft
4
3
2
1
0
insertRight:
0
1
2
3
4
removeRight
4
3
2
1
0
insertLeft:
0
1
2
3
4
removeRight:
0
1
2
3
4
insertRight:
0
1
2
3
4
removeLeft:
0
1
2
3
4*/
