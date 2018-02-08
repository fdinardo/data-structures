package queue;

import exceptions.EmptyQueueException;

public interface IQueue <E>{
	public E dequeue() throws EmptyQueueException;
	public E front() throws EmptyQueueException;
	public void enqueue(E element);
	public boolean isEmpty();
	public int size();
}
