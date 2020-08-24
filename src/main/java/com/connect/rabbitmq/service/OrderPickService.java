package com.connect.rabbitmq.service;

import com.connect.rabbitmq.entity.OrderPickDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class OrderPickService {

    ObjectMapper Obj = new ObjectMapper();

    public OrderPickDetails loadOrderPickDetails (final String sapOrderId, final String pickId){
        return buildNewOrderPickDetails(sapOrderId,pickId);

    }

    public String loadOrderPickDetailsToJson (final String sapOrderId, final String pickId){
        return buildNewOrderPickDetailsToJson(sapOrderId,pickId);

    }

    private OrderPickDetails buildNewOrderPickDetails(final String sapOrderId, final String pickId) {
        final OrderPickDetails newOrderPickDetails = new OrderPickDetails(sapOrderId,pickId);
        return newOrderPickDetails;
    }

    private String buildNewOrderPickDetailsToJson(final String sapOrderId, final String pickId) {
        final OrderPickDetails newOrderPickDetails = new OrderPickDetails(sapOrderId,pickId);
        String jsonString = null;
        try {
            jsonString = Obj.writeValueAsString(newOrderPickDetails);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }
}
