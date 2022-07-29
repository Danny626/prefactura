package com.albo.exception;

import java.io.Serial;

public class ModelAlreadyExistsException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1517148916212576571L;

//	private String message;
	
    public ModelAlreadyExistsException(String message) {
        super(message);
//        this.message = message;
    }

}
