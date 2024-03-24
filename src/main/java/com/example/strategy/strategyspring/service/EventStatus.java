package com.example.strategy.strategyspring.service;

import com.example.strategy.strategyspring.domain.Status;
import org.springframework.http.ResponseEntity;
import org.springframework.plugin.core.Plugin;

public interface EventStatus extends Plugin<Status> {
    ResponseEntity<String> execute();
}