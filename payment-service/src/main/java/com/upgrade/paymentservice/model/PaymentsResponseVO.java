package com.upgrade.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentsResponseVO {

    private String orderId;
    private String paymentStatus;
    private String paymentReferenceNumber;
}
