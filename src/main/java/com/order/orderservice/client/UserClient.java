package com.order.orderservice.client;

import com.order.orderservice.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-DETAILS-SERVICE")
public interface UserClient {

    @GetMapping("/fetchUserById/{id}")
    UserDTO fetchUserById(@PathVariable("id") int id);


}
