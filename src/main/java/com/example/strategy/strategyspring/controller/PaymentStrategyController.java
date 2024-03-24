package com.example.strategy.strategyspring.controller;

import com.example.strategy.strategyspring.domain.Payment;
import com.example.strategy.strategyspring.domain.Status;
import com.example.strategy.strategyspring.service.EventStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentStrategyController {
    private final PluginRegistry<EventStatus, Status> pluginRegistry;

    public PaymentStrategyController(PluginRegistry<EventStatus, Status> pluginRegistry) {
        this.pluginRegistry = pluginRegistry;
    }

    @PostMapping( "/strategy")
    public ResponseEntity<String> springStrategy(@RequestBody Payment payment) {

        Status status = payment.getStatus();

        EventStatus evento = pluginRegistry.getPluginFor(status).get();

        return evento.execute();
    }
}
