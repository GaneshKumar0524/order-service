package com.order.orderservice.mapper;


import com.order.orderservice.dto.OrderDTO;
import com.order.orderservice.entity.Order;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {

    Order mapToOrderEntity(Order order);
    OrderDTO mapToOrderDTO(Order order);
}
