package com.example.strategy.strategyspring.service.impl;

import com.example.strategy.strategyspring.domain.Status;
import com.example.strategy.strategyspring.service.EventStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class InProgressStatusImpl implements EventStatus {

    @Override
    public ResponseEntity<String> execute() {
        return ResponseEntity.ok("InProgressStatusImpl");
    }

    @Override
    public boolean supports(Status status){
        return Status.IN_PROGRESS == status;
    }
}
