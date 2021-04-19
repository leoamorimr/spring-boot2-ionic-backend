package com.leoamorimr.cursomc.service.exception;

public class DataIntegrityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DataIntegrityException(String msg){
        super(msg);
    }

    /**
     * @param message
     * @param cause
     */
    public DataIntegrityException(String message, Throwable cause) {
        super(message, cause);
    }

    

}
