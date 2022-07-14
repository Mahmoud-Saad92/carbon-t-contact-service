package com.bazinga.eg.contactservice.repository;

import com.bazinga.eg.contactservice.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
