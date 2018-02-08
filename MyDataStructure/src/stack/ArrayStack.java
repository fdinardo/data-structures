package stack;

import exceptions.EmptyStackException;

public class ArrayStack<E> implements IStack<E> {
	
	static final int DEFAULT_CAPACITY = 1000;
	
	private int capacity;
	private int _top;
	private E _stack[];

	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		_stack = (E[]) new Object[capacity];
		_top-=1;
		this.capacity = capacity;
	}
	@Override
	public E pop() throws EmptyStackException {
		if(isEmpty()) 
			throw new EmptyStackException("The Stack is Empty");
		
		E element = _stack[_top];
		_stack[_top--]=null;
		
		reduce();
		
		return element;
	}

	@Override
	public E top() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException("The Stack is Empty");
		}
		return _stack[_top];
	}

	@Override
	public void push(E element) {
		enlarge();
		_top += 1;
		_stack[_top] = element;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;		
	}

	@Override
	public int size() {
		return _top + 1;
	}
	
	
	@Override
	public String toString() {
		
		String s="(bottom) [";
		if(!isEmpty()){
			for(int i=0;i<size();i++){
				s+=_stack[i];
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
			array[i] = _stack[i];
		}
		_stack = array;
	}
}
