package springbasic.domain.order.service;

import springbasic.domain.order.entity.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
