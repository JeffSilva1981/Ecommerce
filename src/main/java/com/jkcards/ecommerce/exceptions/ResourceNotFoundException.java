package com.jkcards.ecommerce.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msn) {

        super(msn);
    }
}
