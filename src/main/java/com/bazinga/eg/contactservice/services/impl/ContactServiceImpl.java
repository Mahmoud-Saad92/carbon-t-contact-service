package com.bazinga.eg.contactservice.services.impl;

import com.bazinga.eg.contactservice.dto.ContactDto;
import com.bazinga.eg.contactservice.entity.Contact;
import com.bazinga.eg.contactservice.exception.model.EntityNotFoundException;
import com.bazinga.eg.contactservice.exception.model.EntityPersistException;
import com.bazinga.eg.contactservice.filter.UserContextHolder;
import com.bazinga.eg.contactservice.mapper.ContactMapper;
import com.bazinga.eg.contactservice.repository.ContactRepository;
import com.bazinga.eg.contactservice.services.ContactService;
import com.bazinga.eg.contactservice.services.GenericService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactServiceImpl extends GenericService<Contact, ContactDto> implements ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository, ContactMapper contactMapper) {
        super(contactMapper);
        this.contactRepository = contactRepository;
    }

    @Override
    public ContactDto createContact(ContactDto dto) {
        Contact contact = mapToEntity(dto);

        try {
            contact = contactRepository.save(contact);
        } catch (Exception e) {
            throw new EntityPersistException("contact could not be created", e);
        }

        return mapToDto(contact);
    }

    @Override
    public ContactDto getContactById(Long id) {
        log.debug("getLicensesByOrganization Correlation id: {}", UserContextHolder.getContext().getCorrelationId());

        Contact contact = contactRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Resource not found!!"));

        return mapToDto(contact);
    }
}
