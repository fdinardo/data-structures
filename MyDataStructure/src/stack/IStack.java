package stack;

import exceptions.EmptyStackException;

/**
 * Defines the Stack behaviors
 * 
 * @author Francesco Di Nardo
 *
 * @param <E> the generic object contained by the stack
 */
public interface IStack <E> {
	
	/**
	 * Returns the very top element E removing it  form the stack.
	 * Decreases the stack if needed. 
	 * 
	 * @return E the element to pop out
	 * @throws EmptyStackException
	 */
	public E pop() throws EmptyStackException;
	
	
	/**
	 * Returns the very top element E from the stack without removing it.
	 * 
	 * @return
	 * @throws EmptyStackException
	 */
	public E top() throws EmptyStackException;
	
	/**
	 * Pushes an element E into the stack. 
	 * Increases the stack if needed.
	 * 
	 * @param E the element to push in 
	 */
	public void push(E element);
	
	/**
	 * Checks if the stack doesn't contains any elements.
	 * 
	 * @return True if it's empty, else false.
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the stack's size, which may be differs from the current capacity.
	 * 
	 * @return int size
	 */
	public int size();
}
