package com.leoamorimr.cursomc.service.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

    /**
     * @param message
     * @param cause
     */
    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    

}
