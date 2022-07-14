package com.bazinga.eg.contactservice.mapper;

import com.bazinga.eg.contactservice.dto.ContactDto;
import com.bazinga.eg.contactservice.entity.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ContactMapper implements GenericMapper<Contact, ContactDto> {

    public abstract ContactDto toDto(Contact entity);

    @Mapping(target = "id", ignore = true)
    public abstract Contact toEntity(ContactDto dto);
}
