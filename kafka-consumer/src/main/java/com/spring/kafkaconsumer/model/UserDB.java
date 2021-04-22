package com.spring.kafkaconsumer.model;

import com.spring.kafkacommon.model.Account;
import com.spring.kafkacommon.model.Address;
import com.spring.kafkacommon.model.User;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document("users")
public class UserDB extends User {

    @Builder
    public UserDB(String id, String version, String firstName, String lastName, String birthDate, Account account, Address address) {
        super(id, version, firstName, lastName, birthDate, account, address);
    }
}
