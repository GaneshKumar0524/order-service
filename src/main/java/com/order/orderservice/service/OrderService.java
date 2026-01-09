package com.order.orderservice.service;


import com.order.orderservice.client.UserClient;
import com.order.orderservice.dto.OrderDTO;
import com.order.orderservice.dto.OrderDTOFromFE;
import com.order.orderservice.dto.UserDTO;
import com.order.orderservice.entity.Order;
import com.order.orderservice.mapper.OrderMapper;
import com.order.orderservice.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    UserClient userClient;

    @Autowired
    OrderMapper orderMapper;

    public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {

        Integer newOrderId = sequenceGenerator.generateNextOrderId();

        UserDTO userDTO = fetchUserDetailsFromUserID(orderDetails.getUserId());

        Order newOrder = new Order(newOrderId,
                orderDetails.getFoodItemsList(),
                orderDetails.getRestaurant(),
                userDTO);
        orderRepo.save(newOrder);
        return orderMapper.mapToOrderDTO(newOrder);
    }
    private UserDTO fetchUserDetailsFromUserID(Integer userId) {
        return userClient.fetchUserById(userId);
    }
}
