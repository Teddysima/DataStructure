
class StackApp {

	public static void main(String[] args) {
		StackY theStack = new StackY(5); 
		
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		theStack.push(100);
		theStack.push(111);
		
		System.out.println(theStack.size()+1);
		System.out.println(theStack.isElement(20));
		System.out.println(theStack);
		
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		
		theStack.clear();
		System.out.println("the stack is clear.");
		
		StackY s1 = new StackY(2);
		StackY s2 = new StackY(2);
		
		
		s1.push(12);
		s1.push(16);
		
		s2.push(121);
		s2.push(160);
		
		StackY s3 = merge(s1, s2);
		System.out.println(s3);
	} 
	
	public static StackY merge(StackY s1, StackY s2 ){
		StackY s3 = new StackY(s1.size() + s2.size());
		while(!s1.isEmpty()){
			s3.push(s1.pop());
		}
		while(!s2.isEmpty()){
			s3.push(s2.pop());
		}
		return s3;
	}

}
/*out put
 * Can’t insert, stack is full
6
true
[ 100 80 60 40 20 ]
Can’t Delete, stack is empty
the stack is clear.
[ 121 160 12 16 ]*/
