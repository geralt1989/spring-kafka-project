package com.spring.kafkaconsumer.configuration;


import com.spring.kafkaconsumer.mapper.UserMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    UserMapper userMapper() {
        return Mappers.getMapper(UserMapper.class);
    }
}


