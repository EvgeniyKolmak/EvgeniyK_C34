package org.fastfood.service.impl;

import org.fastfood.domain.Order;
import org.fastfood.service.OrderCookService;

public class OrderCookServiceImpl implements OrderCookService {

    @Override
    public void cookOrder(Order order) {
        System.out.println("Заказ готовится: " + order.getText());
    }
}
