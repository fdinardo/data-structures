package exercises.stack;

import stack.ArrayStack;
import stack.IStack;

public class StackExercise {
	
	/**
	 * Generic method to reverse a given array using a stack.
	 * Not recursive.
	 * 
	 * @param array
	 */
	public static <E> void ReverseArray(E[] array) {
		IStack<E> stack = new ArrayStack<>(array.length);
		
		for(int i = 0; i < array.length; i++) {
			stack.push(array[i]);
		}
		
		for(int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
		}
	}
	
	/**
	 * 
	 * @param stack
	 * @param x
	 */
	public static <E> void localReverse(IStack<E> stack, int x) {
		if(x <= 0) {
			throw new InvalidArgumentException("x cannot be less or equal to 0.");
		}
		
		int offset = stack.size() - x;
		//TODO: Implement the Queue in order to finish this exercise
	}
	
	
	public static <E> void checkBrackets() {
		
	}
	
	
	
	/**
	 * Exceptions
	 * @author Francesco
	 *
	 */
	protected static class InvalidArgumentException extends RuntimeException {
		
		private static final long serialVersionUID = 1L;

		public InvalidArgumentException(String message) {
			super(message);
		}
	}
}