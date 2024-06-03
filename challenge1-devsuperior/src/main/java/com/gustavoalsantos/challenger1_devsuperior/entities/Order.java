package com.gustavoalsantos.challenger1_devsuperior.entities;

public class Order {
    private Integer idOrder;
    private Double basic;
    private Double discount;

    public Order(Integer idOrder, Double basic, Double discount) {
        this.idOrder = idOrder;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }
}
