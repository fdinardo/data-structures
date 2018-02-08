package exceptions;

public class EmptyQueueException extends RuntimeException {
	/**
	 * Thrown when a Queue is empty and a dequeue or front operation are executed
	 */
	private static final long serialVersionUID = 1L;

	public EmptyQueueException(String message) {
		super(message);
	}
}
