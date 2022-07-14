package com.bazinga.eg.contactservice.dto;

import lombok.*;

@EqualsAndHashCode
@Getter
@Setter
@ToString
@Builder(toBuilder = true)
public class AddressDto {
    private String country;
    private String city;
    private String street;
    private Integer houseNumber;
}
