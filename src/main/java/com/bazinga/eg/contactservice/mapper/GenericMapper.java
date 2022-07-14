package com.bazinga.eg.contactservice.mapper;

public interface GenericMapper<T, R> {

    T toEntity(R dto);
    R toDto(T entity);
}
