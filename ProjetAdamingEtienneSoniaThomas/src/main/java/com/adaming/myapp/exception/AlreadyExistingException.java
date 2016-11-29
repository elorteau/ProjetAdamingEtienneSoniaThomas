/*
 * AlreadyExistingException
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.exception;

public class AlreadyExistingException extends Exception {

	public AlreadyExistingException() {
	}

	public AlreadyExistingException(String message) {
		super(message);
	}

	public AlreadyExistingException(Throwable cause) {
		super(cause);
	}

	public AlreadyExistingException(String message, Throwable cause) {
		super(message, cause);
	}

	public AlreadyExistingException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
