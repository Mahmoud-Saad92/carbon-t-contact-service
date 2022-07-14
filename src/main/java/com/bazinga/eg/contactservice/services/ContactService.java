package com.bazinga.eg.contactservice.services;

import com.bazinga.eg.contactservice.dto.ContactDto;

public interface ContactService {

    ContactDto createContact(ContactDto dto);
    ContactDto getContactById(Long id);
}
