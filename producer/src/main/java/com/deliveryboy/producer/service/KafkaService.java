package com.deliveryboy.producer.service;

import com.deliveryboy.producer.constants.AppConstants;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    public boolean updatelocation(String location){
        this.kafkaTemplate.send(AppConstants.UPDATE_LOCATION_TOPIC,location);
        System.out.println("Location"+" "+location);
        return true;
    }
}
