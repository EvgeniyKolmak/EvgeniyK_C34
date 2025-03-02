package org.fastfood.service;

import org.fastfood.domain.Order;

public interface OrderDeliveryService {

    void deliveryOrder(Order order);

    default void pickupOrder(Order order) {
        System.out.println("Заказ выдан через окно: " + order.getText());
    }

}
