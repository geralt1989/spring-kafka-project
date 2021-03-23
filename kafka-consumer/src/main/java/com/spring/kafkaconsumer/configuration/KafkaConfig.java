//package com.spring.kafkaconsumer.config;
//
//import com.spring.kafkaconsumer.model.User;
//import com.spring.kafkaconsumer.service.MongoService;
//import lombok.RequiredArgsConstructor;
//import org.apache.kafka.streams.StreamsBuilder;
//import org.apache.kafka.streams.kstream.KStream;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafkaStreams;
//
//@Configuration
//@EnableKafkaStreams
//@RequiredArgsConstructor
//public class KafkaConfig {
//
//    private final MongoService mongoService;
//
//    @Value("${custom.kafka.topic.users}")
//    private String topic;
//
//
//    @Bean
//    KStream<String, User> kStream(StreamsBuilder streamsBuilder) {
//        KStream<String, User> kStream = streamsBuilder.stream(topic);
//        return kStream.mapValues(this::processValues);
//    };
//
//    public User processValues(String key, User user) {
//        return mongoService.saveUser(user);
//    }
//}
