package com.connect.rabbitmq.service;

import com.connect.rabbitmq.entity.OrderPickDetails;
import org.springframework.stereotype.Service;

@Service
public class OrderPickService {

    public OrderPickDetails loadOrderPickDetails (final String sapOrderId, final String pickId){
        return buildNewOrderPickDetails(sapOrderId,pickId);

    }


    private OrderPickDetails buildNewOrderPickDetails(final String sapOrderId, final String pickId) {
        final OrderPickDetails newOrderPickDetails = new OrderPickDetails(sapOrderId,pickId);
        return newOrderPickDetails;
    }
}
