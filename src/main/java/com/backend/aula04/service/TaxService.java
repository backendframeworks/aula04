package com.backend.aula04.service;

import org.springframework.stereotype.Service;
@Service
public class TaxService {
    public double calculateTax(double cost){
        return cost * 0.1;
    }
}
