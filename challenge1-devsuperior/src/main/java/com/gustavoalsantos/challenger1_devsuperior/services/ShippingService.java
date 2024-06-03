package com.gustavoalsantos.challenger1_devsuperior.services;

import com.gustavoalsantos.challenger1_devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order){
        double basic = order.getBasic();

        return basic < 100 ? 20.0 : (basic < 200.0 ? 12.0 : 0.0);
    }
}
