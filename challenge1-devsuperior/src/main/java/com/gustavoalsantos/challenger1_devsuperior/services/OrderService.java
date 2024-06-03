package com.gustavoalsantos.challenger1_devsuperior.services;

import com.gustavoalsantos.challenger1_devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ShippingService shipping;

    public OrderService(ShippingService shipping) {
        this.shipping = shipping;
    }

    public Double total(Order order){
      return order.getBasic() - (order.getBasic() * (order.getDiscount()/100.0)) + shipping.shipment(order);
    }
}
