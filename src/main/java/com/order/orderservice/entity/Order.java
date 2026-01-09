package com.order.orderservice.entity;


import com.order.orderservice.dto.FoodItemsDTO;
import com.order.orderservice.dto.Restaurant;
import com.order.orderservice.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

    private Integer orderId;
    private List<FoodItemsDTO> foodItems;
    private Restaurant restaurant;
    private UserDTO user;
}
