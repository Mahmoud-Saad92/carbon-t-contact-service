package com.bazinga.eg.contactservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contacts")
@Getter @Setter @ToString
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long userId;

    @ElementCollection
    @CollectionTable(name = "contact_addresses", joinColumns = @JoinColumn(name = "contact_id"), foreignKey = @ForeignKey(name = "contact_addresses_fk"))
    private List<Address> addresses;
}
