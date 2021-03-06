package com.bazinga.eg.contactservice.filter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserContext {
    private String correlationId;
    private String authToken;
    private String userId;
    private String contactId;
}
