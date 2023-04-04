package orderservice.MSAOrderService.service;

import orderservice.MSAOrderService.dto.OrderDto;
import orderservice.MSAOrderService.jpa.OrderEntity;

public interface OrderService {
    // 주문값을 하나 저장
    OrderDto createOrder(OrderDto orderDetails);

    // 사용자 한명이 여러개의 주문을 할 경우
    Iterable<OrderEntity> getOrdersByUserId(String userId);

    // 주문 ID를 가지고 검색
    OrderDto getOrderByOrderId(String orderId);
}
