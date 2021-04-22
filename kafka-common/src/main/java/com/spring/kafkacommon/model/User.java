package com.spring.kafkacommon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    protected String id;
    @Version
    protected String version;
    protected String firstName;
    protected String lastName;
    protected String birthDate;
    protected Account account;
    protected Address address;

}
