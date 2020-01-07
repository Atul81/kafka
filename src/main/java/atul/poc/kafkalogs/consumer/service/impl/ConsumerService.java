package atul.poc.kafkalogs.consumer.service.impl;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//import atul.poc.kafkalogs.consumer.service.IConsumer;
//import lombok.extern.slf4j.Slf4j;
//
//@Service
//@Slf4j
//public class ConsumerService implements IConsumer
//{
//    @Override
//    @KafkaListener(topics = "users", groupId = "group_id")
//    public void consume(String message)
//    {
//        log.info(String.format("$$ -> Consumed Message -> %s", message));
//    }
//}
