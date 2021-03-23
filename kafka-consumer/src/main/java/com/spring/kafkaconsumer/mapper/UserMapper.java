package com.spring.kafkaconsumer.mapper;

import com.spring.kafkacommon.model.User;
import com.spring.kafkaconsumer.model.UserDB;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({})
    UserDB mapToUserDB(User user);

}
