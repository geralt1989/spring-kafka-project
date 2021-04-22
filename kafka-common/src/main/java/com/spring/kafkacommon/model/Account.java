package com.spring.kafkacommon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private String username;
    private String password;
    private Role role;
    private String email;
    private Date registrationDate = new Date();

}
