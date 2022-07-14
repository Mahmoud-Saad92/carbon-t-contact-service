package com.bazinga.eg.contactservice.controller;

import com.bazinga.eg.contactservice.dto.ContactDto;
import com.bazinga.eg.contactservice.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {

    private final ContactService contactServiceImpl;

    @Autowired
    public ContactController(ContactService contactServiceImpl) {
        this.contactServiceImpl = contactServiceImpl;
    }

    @PostMapping
    public ResponseEntity<ContactDto> createContact(@RequestBody ContactDto dto) {
        ContactDto contact = contactServiceImpl.createContact(dto);

        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactDto> getContactById(@PathVariable Long id) {
        ContactDto contact = contactServiceImpl.getContactById(id);

        return new ResponseEntity<>(contact, HttpStatus.FOUND);
    }
}
