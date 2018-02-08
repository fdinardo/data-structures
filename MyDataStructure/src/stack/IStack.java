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
	public E pop() throws EmptyStackException;
	public E top() throws EmptyStackException;
	public void push(E element);
	public boolean isEmpty();
	public int size();
}
