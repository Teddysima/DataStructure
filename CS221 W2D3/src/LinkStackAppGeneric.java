

public class LinkStackAppGeneric {
	public static void main(String[] args) {
		LinkStackGeneric<Float> theStack = new LinkStackGeneric<Float>();

		LinkStackGeneric<Double> theStack2 = new LinkStackGeneric<Double>();

		theStack.push(20.8f);
		theStack.push(40.5f);

		theStack.displayStack();

		theStack.push(60.8f);
		theStack.push(80.5f);

		theStack.displayStack();

		theStack.pop();
		theStack.pop();
		theStack.displayStack();
		theStack.pop();
		theStack.pop();
		System.out.println("Item Deleted : " + theStack.pop());
		theStack.displayStack();

		System.out.println("for the double ");
		theStack2.push(2.2);
		theStack2.push(7.9);

		theStack.displayStack();

		theStack2.push(39.8);
		theStack2.push(45.8);

		theStack2.displayStack();

		theStack2.pop();
		theStack2.pop();
		theStack2.displayStack();
		theStack2.pop();
		theStack2.pop();
		System.out.println("Item Deleted : " + theStack2.pop());
		theStack2.displayStack();
	}

}
/*output
 * Stack (top-->bottom): 40.5 20.8 
Stack (top-->bottom): 80.5 60.8 40.5 20.8 
Stack (top-->bottom): 40.5 20.8 
Item Deleted : null
Stack (top-->bottom): 
for the double 
Stack (top-->bottom): 
Stack (top-->bottom): 45.8 39.8 7.9 2.2 
Stack (top-->bottom): 7.9 2.2 
Item Deleted : null
Stack (top-->bottom): */
