package com.jkcards.ecommerce.exceptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msn) {
        super(msn);
    }
}
