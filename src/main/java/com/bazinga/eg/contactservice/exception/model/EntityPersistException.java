package com.bazinga.eg.contactservice.exception.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class EntityPersistException extends RuntimeException {

    private String msg;

    public EntityPersistException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public EntityPersistException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }
}
