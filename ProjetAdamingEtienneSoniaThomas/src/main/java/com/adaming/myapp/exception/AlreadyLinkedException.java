/*
 * AlreadyLinkedException
 * Version: 1.0.0
 * Date: 25/11/2016
 * Author: S. Ferhaten - E. Lorteau - T. Saint Georges
 */

package com.adaming.myapp.exception;

public class AlreadyLinkedException extends Exception {

	public AlreadyLinkedException() {
	}

	public AlreadyLinkedException(String message) {
		super(message);
	}

	public AlreadyLinkedException(Throwable cause) {
		super(cause);
	}

	public AlreadyLinkedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AlreadyLinkedException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
