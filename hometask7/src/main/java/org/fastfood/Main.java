package org.fastfood;

import org.fastfood.domain.Order;
import org.fastfood.service.OrderDeliveryService;
import org.fastfood.service.OrderManagementService;
import org.fastfood.service.impl.*;

public class Main {

    public static void main(String[] args) {
        Order order = new Order("burger");

        OrderDeliveryService deliveryService = new OrderHomeDeliveryServiceImpl();

        OrderManagementService managementService =
                new OrderManagementServiceImpl(
                        new OnlineOrderReceiveServiceImpl(),
                        new OrderDatabaseDataServiceImpl(),
                        new OrderCookServiceImpl(),
                        new OrderHomeDeliveryServiceImpl()
                );

        managementService.processOrder(order);

        managementService =
                new OrderManagementServiceImpl(
                        new PhoneOrderReceiveServiceImpl(),
                        new OrderDatabaseDataServiceImpl(),
                        new OrderCookServiceImpl(),
                        new OrderHomeDeliveryServiceImpl()
                );

        managementService.processOrder(order);
    }

}
