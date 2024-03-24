package com.example.strategy.strategyenum.domain;

import org.springframework.http.ResponseEntity;

public enum Status {
    IN_PROGRESS(){
        @Override
        public ResponseEntity process() {

            return ResponseEntity.ok("IN_PROGRESS");
        }
    },
    APPROVED {
        @Override
        public ResponseEntity process() {
            return ResponseEntity.ok("APPROVED");
        }
    };

    public abstract ResponseEntity process();
}
