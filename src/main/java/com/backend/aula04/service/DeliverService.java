package com.backend.aula04.service;

import org.springframework.stereotype.Service;

@Service
public class DeliverService {
    public double calculateDeliverPrice(String state){
        if("PE".equalsIgnoreCase(state)){
            return 10;
        }
        return 20;
    }
}
