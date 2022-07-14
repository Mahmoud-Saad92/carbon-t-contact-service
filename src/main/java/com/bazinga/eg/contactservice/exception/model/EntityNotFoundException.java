package com.bazinga.eg.contactservice.exception.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class EntityNotFoundException extends RuntimeException {
    private String msg;

    public EntityNotFoundException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public EntityNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }
}
