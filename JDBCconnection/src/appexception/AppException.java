package appexception;

public class AppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public AppException() {
		super();
	}

	@Override
	public String getMessage() {

		return this.message;
	}

	public AppException(String message) {
		super();
		this.message = message;
	}

}
