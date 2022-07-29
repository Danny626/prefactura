package com.albo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModeloNotFoundException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = -6371964144765332643L;

	public ModeloNotFoundException(String mensaje) {
		super(mensaje);
	}
}
