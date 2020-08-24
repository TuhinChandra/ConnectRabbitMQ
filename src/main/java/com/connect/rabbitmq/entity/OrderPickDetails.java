package com.connect.rabbitmq.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OrderPickDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sapOrderId;
    private String pickId;

    public OrderPickDetails(final String sapOrderId, final String pickId){
        this.sapOrderId=sapOrderId;
        this.pickId=pickId;
    }

    @Override
    public String toString()
    {
        return "OrderPickDetails [sapOrderId="
                + sapOrderId
                + ", pickId="
                + pickId + "]";
    }

/*  private String submittedDate;
    private String orderState;
    private String pickingStatus;
    private String itemStatus;
    private String clickAndCollectStoreId;
    private String fulfilmentSiteId;
    private long ean;
    private String displayName;
    private int quantity;
    private double unitPrice;
    private double totalPrice;
    private String promisedCollectionDate;
    private String deliveryDate;
    private String fulfilmentSourceType;
    private String reallocationStatus;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String eveningPhoneNumber;
    private String altContactPhone;
    private String lastModified;
    private String shippingMethod;*/
}
