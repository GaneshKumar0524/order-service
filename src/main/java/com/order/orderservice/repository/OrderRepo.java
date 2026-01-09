package com.order.orderservice.repository;

import com.order.orderservice.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  OrderRepo extends MongoRepository<Order,String> {
}
