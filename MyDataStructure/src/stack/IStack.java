package stack;

import exceptions.EmptyStackException;

/**
 * Defines the Stack's behaviors.
 * A set of objects which are Pushed and Extracted from the container 
 * following the Last-in-first-out principle
 * 
 * @author Francesco Di Nardo
 *
 * @param <E> the generic object contained by the stack
 */
public interface IStack <E> {
	
	/**
	 * Extracts the very top element form the stack.
	 * Decreases the stack if needed.
	 * If the stack is empty an Exception is thrown. 
	 * 
	 * @return the element to pop out
	 * @throws EmptyStackException
	 */
	public E pop() throws EmptyStackException;
	
	/**
	 * Returns the very top element E from the stack without removing it.
	 * 
	 * @return the element a the top
	 * @throws EmptyStackException
	 */
	public E top() throws EmptyStackException;
	
	/**
	 * Pushes an element E into the stack in the very top position. 
	 * Increases the stack if needed.
	 * 
	 * @param element  the element to push into the stack 
	 */
	public void push(E element);
	
	/**
	 * Checks if the stack doesn't contains any elements.
	 * 
	 * @return True if it's empty, else false.
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the number of the elements inside the stack.
	 * This may be different from the current capacity.
	 * 
	 * @return the current stack's size.
	 */
	public int size();
}
