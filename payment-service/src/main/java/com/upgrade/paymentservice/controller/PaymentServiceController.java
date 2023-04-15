package com.upgrade.paymentservice.controller;

import com.upgrade.paymentservice.model.PaymentsResponseVO;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static com.upgrade.paymentservice.constants.PaymentConstants.PAYMENTS_SUCCESS;

@RestController
@Log4j2
public class PaymentServiceController {

    @GetMapping("/v1/payments/status")
    public ResponseEntity<PaymentsResponseVO> getPaymentsStatus(@RequestParam String orderId) throws InterruptedException {
        log.info("Payment status for order Id: "+orderId);
//        Thread.sleep(2000);
        return ResponseEntity.ok(PaymentsResponseVO
                .builder()
                .orderId(orderId)
                .paymentStatus(PAYMENTS_SUCCESS)
                .paymentReferenceNumber(UUID.randomUUID().toString()) //mocking the response
                .build()
        );
    }
}
