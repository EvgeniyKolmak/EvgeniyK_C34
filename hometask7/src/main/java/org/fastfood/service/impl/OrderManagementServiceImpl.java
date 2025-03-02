package org.fastfood.service.impl;

import org.fastfood.domain.Order;
import org.fastfood.service.*;

public class OrderManagementServiceImpl implements OrderManagementService {

    private final OrderReceiveService receiveService;
    private final OrderDataService dataService;
    private final OrderCookService cookService;
    private final OrderDeliveryService deliveryService;

    public OrderManagementServiceImpl(OrderReceiveService receiveService,
                                      OrderDataService dataService,
                                      OrderCookService cookService,
                                      OrderDeliveryService deliveryService) {
        this.receiveService = receiveService;
        this.dataService = dataService;
        this.cookService = cookService;
        this.deliveryService = deliveryService;
    }

    @Override
    public void processOrder(Order order) {
        boolean isValid = receiveService.receiveOrder(order);

        if(isValid) {
            dataService.saveOrder(order);
            cookService.cookOrder(order);
            deliveryService.pickupOrder(order);
        }
    }
}
