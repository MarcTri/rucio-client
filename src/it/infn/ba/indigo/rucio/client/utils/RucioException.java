package it.infn.ba.indigo.rucio.client.utils;

public class RucioException extends Exception{
	
	/**
	 * @Version
	 */
	private static final long serialVersionUID = 1L;
	
	private String message = null;
	
	public RucioException() {
		super();
	}
	
	public RucioException(String message) {
		super(message);
		this.message = message;
	}
	
	public RucioException(Throwable cause) {
		super(cause);
	}
	
	@Override
	public String toString() {
		return message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
