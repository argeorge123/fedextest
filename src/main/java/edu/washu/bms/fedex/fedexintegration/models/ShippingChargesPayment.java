package edu.washu.bms.fedex.fedexintegration.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ShippingChargesPayment
{
    private String paymentType;
    private Payor payor;
}
