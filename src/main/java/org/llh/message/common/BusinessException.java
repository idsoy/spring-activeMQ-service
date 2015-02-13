package org.llh.message.common;

public class BusinessException extends Exception {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -3453640177881908977L;

	public BusinessException() {
		super();
	}

	public BusinessException(String msg) {
		super(msg);
	}

	public BusinessException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}
}
