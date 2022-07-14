package com.bazinga.eg.contactservice.exception.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class EntityMappingException extends RuntimeException {

    private String message;

    public EntityMappingException(String message) {
        super(message);
        this.message = message;
    }

    public EntityMappingException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }
}
