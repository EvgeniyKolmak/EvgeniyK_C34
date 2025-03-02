package org.fastfood.service.impl;

import org.fastfood.domain.Order;
import org.fastfood.service.OrderDataService;

public class OrderDatabaseDataServiceImpl implements OrderDataService {

    @Override
    public void saveOrder(Order order) {
        System.out.println("Заказ сохранён в БД: " + order.getText());
    }
}
