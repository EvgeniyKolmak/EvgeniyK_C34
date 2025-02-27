package org.fastfood.service.impl;

import org.fastfood.domain.Order;
import org.fastfood.service.OrderDeliveryService;

public class OrderHomeDeliveryServiceImpl implements OrderDeliveryService {

    @Override
    public void deliveryOrder(Order order) {
        System.out.println("Заказ доставлен до дома клиента: " + order.getText());
    }

}
