package com.bazinga.eg.contactservice.dto;

import lombok.*;

import java.util.List;

@EqualsAndHashCode
@Getter @Setter @ToString
@Builder(toBuilder = true)
public class ContactDto {

    private Long userId;
    private List<AddressDto> addresses;
}
