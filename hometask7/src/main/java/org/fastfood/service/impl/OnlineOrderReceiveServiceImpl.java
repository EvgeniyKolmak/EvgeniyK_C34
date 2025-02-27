package org.fastfood.service.impl;

import org.fastfood.domain.Order;
import org.fastfood.service.OrderReceiveService;

public class OnlineOrderReceiveServiceImpl implements OrderReceiveService {

    @Override
    public boolean receiveOrder(Order order) {
        if (!order.getText().isEmpty()) {
            System.out.println("Заказ принят онлайн: " + order.getText());
            return true;
        }
        System.out.println("Заказ не оформлен");
        return false;
    }
}
