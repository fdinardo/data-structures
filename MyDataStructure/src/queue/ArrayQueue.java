package queue;

import exceptions.EmptyQueueException;

public class ArrayQueue <E> implements IQueue<E> {

	private static final int DEFAULT_CAPACITY = 1000;
	
	private int capacity;
	private int front;
	private int rear;
	private E[] queue;
	
	
	@Override
	public E dequeue() throws EmptyQueueException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E front() throws EmptyQueueException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enqueue(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
