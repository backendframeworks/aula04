package com.backend.aula04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
    @Autowired
    private TaxService taxService;
    @Autowired
    private DeliverService deliverService;

    public double calculateFinalPrice(double cost, String state){
        return cost + taxService.calculateTax(cost) + deliverService.calculateDeliverPrice(state);
    }
}
