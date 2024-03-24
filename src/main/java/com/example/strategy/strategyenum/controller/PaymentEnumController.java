package com.example.strategy.strategyenum.controller;

import com.example.strategy.strategyenum.domain.Payment;
import com.example.strategy.strategyenum.domain.Status;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentEnumController {

    @PostMapping("/enum")
    public ResponseEntity enumStrategy(@RequestBody Payment payment) {

        Status status = payment.getStatus();

        return status.process();
    }
}
