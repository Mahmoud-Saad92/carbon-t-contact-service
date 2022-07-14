package com.bazinga.eg.contactservice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter @ToString
public class Address {
    private String country;
    private String city;
    private String street;
    private Integer houseNumber;
}
