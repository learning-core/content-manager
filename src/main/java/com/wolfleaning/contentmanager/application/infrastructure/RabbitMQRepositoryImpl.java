package com.wolfleaning.contentmanager.application.infrastructure;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wolfleaning.contentmanager.domain.port.IRabbitMQRepository;
import com.wolfleaning.contentmanager.domain.entity.ContentDomain;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RabbitMQRepositoryImpl implements IRabbitMQRepository {

    private RabbitTemplate rabbitTemplate;
    private ObjectMapper objectMapper;
    private static final String EXCHANGE = "";
    private static final String ROUTING_KEY = "";

    @Override
    public void save(ContentDomain domain) {

    }

    private void sendToQueue(Exchange exchange){}
}
