package atul.poc.kafkalogs.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atul.poc.kafkalogs.producer.service.IProducer;

@RestController
@RequestMapping(value = "/producer")
public class ProducerController
{
    private final IProducer iProducer;

    @Autowired
    public ProducerController(IProducer iProducer)
    {
        this.iProducer = iProducer;
    }


    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message){
        this.iProducer.sendMessage(message);
    }
}
