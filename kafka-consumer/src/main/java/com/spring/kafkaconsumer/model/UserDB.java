package com.spring.kafkaconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("users")
public class UserDB {

    @Id
    private String id;
    @Version
    private String version;
    private String firstName;
    private String lastName;
    private String birthDate;
    private AccountDB account;
    private AddressDB address;

}
