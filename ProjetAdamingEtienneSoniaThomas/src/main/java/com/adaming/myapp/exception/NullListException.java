/*
 * NullListException
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.exception;

public class NullListException extends Exception {

	public NullListException() {
	}

	public NullListException(String message) {
		super(message);
	}

	public NullListException(Throwable cause) {
		super(cause);
	}

	public NullListException(String message, Throwable cause) {
		super(message, cause);
	}

	public NullListException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
