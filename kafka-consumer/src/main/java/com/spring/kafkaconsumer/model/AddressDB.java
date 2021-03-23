package com.spring.kafkaconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDB {

    private String street;
    private String suite;
    private String city;
    private String zipCode;
    private GeoDB geo;

}
