package com.order.orderservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {

    public List<FoodItemsDTO> foodItemsList;
    private Integer userId;
    private Restaurant restaurant;
}
