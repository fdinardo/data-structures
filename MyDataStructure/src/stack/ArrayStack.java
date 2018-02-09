package stack;

import exceptions.EmptyStackException;

public class ArrayStack<E> implements IStack<E> {
	
	static final int DEFAULT_CAPACITY = 1000;
	
	private int capacity;
	private int top;
	private E stack[];

	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		stack = (E[]) new Object[capacity];
		top-=1;
		this.capacity = capacity;
	}
	
	@Override
	public E pop() throws EmptyStackException {
		if(isEmpty()) 
			throw new EmptyStackException("The Stack is Empty");
		
		E element = stack[top];
		stack[top--]=null;
		
		reduce();
		
		return element;
	}

	@Override
	public E top() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException("The Stack is Empty");
		}
		return stack[top];
	}

	@Override
	public void push(E element) {
		enlarge();
		top += 1;
		stack[top] = element;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;		
	}

	@Override
	public int size() {
		return top + 1;
	}
	
	@Override
	public String toString() {
		
		String s="(bottom) [";
		if(!isEmpty()){
			for(int i=0;i<size();i++){
				s+=stack[i];
				if(i!=size()-1)
					s+=", ";
			}
		}
		s+="] (top)";
		return s;
		
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	private void reduce() {
		if(size() <= capacity/4) {
			capacity /= 2;
			resize();
		}
		
	}
	
	private void enlarge() {
		if(size() == capacity) {
			capacity *= 2;
			resize();
		}
	}
	
	@SuppressWarnings("unchecked")
	private void resize() {
		E[] array = (E[]) new Object[capacity];
		for(int i = 0; i<size(); i++) {
			array[i] = stack[i];
		}
		stack = array;
	}
}
