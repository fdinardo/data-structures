package programs;

import stack.ArrayStack;

public class DataStructure {

	public static void main(String[] args) {
		
		ArrayStack<Integer> stack = new ArrayStack<Integer>(2);
		
		stack.push(1);
		stack.push(2);
		
		System.out.println("This is the stack:");
		System.out.println(stack.toString());
		
		System.out.println("Perform a pop operation...");
		stack.pop();
		System.out.println(stack.toString());
		
		System.out.println("Adding more elements...");
		stack.push(5);
		stack.push(45);
		stack.push(32);
		stack.push(43);
		
		System.out.println(stack.toString());
			
	}

}
