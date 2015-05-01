
import java.util.Scanner;

public class stackTeddyTestDrive {

	public static void main(String[] args) {

		stackTeddy st = new stackTeddy(3);
		long n;
		int input;
		while (true) {
			System.out
					.println("enter 1 to push, 2 to pop, 3 to peek, 4 to quit: ");
			Scanner in = new Scanner(System.in);
			input = in.nextInt();
			switch (input) {
			case 1:
				try {

					System.out.print("enter the number to push: ");
					n = in.nextInt();
					st.push(n);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					n = st.pop();
					System.out.println("pooped number is " + n);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					n = st.peek();
					System.out.println("peeked number is " + n);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("good bye!");
				return;
			default:
				System.out.println("invalid commaned ");

			}
		}
	}

}
/*output
 * enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
1
enter the number to push: 12
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
1
enter the number to push: 23
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
11
invalid commaned 
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
89
invalid commaned 
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
2
pooped number is 23
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
3
peeked number is 12
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
2
pooped number is 12
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
2
stack is empty.
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
4
good bye!*/
