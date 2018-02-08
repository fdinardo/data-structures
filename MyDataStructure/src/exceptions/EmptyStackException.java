package exceptions;

public class EmptyStackException extends RuntimeException {

	/**
	 * Thrown when a Stack is empty
	 */
	private static final long serialVersionUID = 1L;

	public EmptyStackException(String message) {
		super(message);
	}
}
