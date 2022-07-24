package com.bazinga.eg.contactservice.filter;

import org.springframework.util.Assert;

import java.util.Objects;

public class UserContextHolder {

    private static final ThreadLocal<UserContext> USER_CONTEXT = new ThreadLocal<>();

    public static UserContext getContext() {
        UserContext userContext = USER_CONTEXT.get();

        if (Objects.isNull(userContext)) {
            userContext = createEmptyContext();
            USER_CONTEXT.set(userContext);
        }

        return userContext;
    }

    public static void setContext(UserContext userContext) {
        Assert.notNull(userContext, "Only non-null UserContext instances are permitted");
        USER_CONTEXT.set(userContext);
    }

    public static UserContext createEmptyContext() {
        return new UserContext();
    }
}
