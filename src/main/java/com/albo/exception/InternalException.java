package com.albo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = -8107537963928322094L;

	public InternalException(String mensaje) {
		super(mensaje);
	}
}
